package Maven_examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Apputils.DBConnection;
import Apputils.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_db_automate {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        System.out.print("driver setup done");

        ExcelUtil excel = new ExcelUtil("LoginResults"); 
        
        try (Connection conn = DBConnection.getConnection()) {
            System.out.println("Database connected");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT userid, password FROM UserLoginDetails");

            while (rs.next()) {
                String username = rs.getString("userid");
                String password = rs.getString("password");

                driver.navigate().to("https://www.mycontactform.com/index.php");
               
                driver.findElement(By.name("user")).clear();
                driver.findElement(By.name("user")).sendKeys(username);
                System.out.println("username  "+username);

                driver.findElement(By.name("pass")).clear();
                driver.findElement(By.name("pass")).sendKeys(password);
                System.out.println("password  "+password);

                

                List<WebElement> submitBtns = driver.findElements(By.name("btnSubmit"));
                String loginMsg = "No message found";

                if (!submitBtns.isEmpty()) {
                    submitBtns.get(0).click();
                    Thread.sleep(2000);

                    List<WebElement> errorMsgs = driver.findElements(By.xpath("//span[@class='error']"));
                    List<WebElement> userBar = driver.findElements(By.xpath("//*[@id='user_bar']/ul/li[1]/a"));

                    if (!errorMsgs.isEmpty()) {
                        loginMsg = "Invalid login credentials";
                        

                    } else if (!userBar.isEmpty()) {
                        loginMsg = "Login successfully";
                       

                        // Logout after success
                        userBar.get(0).click();
                    }
                } else {
                    loginMsg = "Login button missing";
                }

                // Add data to Excel
                excel.addRow(username, password, loginMsg);
            }

            rs.close();
            stmt.close();

            // Save the Excel file
            excel.save("LoginResults.xlsx");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
