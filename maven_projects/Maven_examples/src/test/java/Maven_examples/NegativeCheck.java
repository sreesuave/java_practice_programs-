package Maven_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NegativeCheck {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.mycontactform.com/signup.php");

        System.out.println("invalid character input error");
        System.out.println("=====================");
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("user_signup")).clear();
     
        driver.findElement(By.name("name")).sendKeys(".....");
        driver.findElement(By.name("email")).sendKeys("samplemail@gmail.com");
        driver.findElement(By.name("user_signup")).sendKeys("luffy87807");

        driver.findElement(By.name("pass_signup")).sendKeys("luffy@12345");
        driver.findElement(By.name("pass2")).sendKeys("luffy@12345");
        
        
  driver.findElement(By.name("useragree")).click(); driver.findElement(By.name("Submit")).click();
        WebElement errorMsg = driver.findElement(By.xpath("//div[@id='error_status']"));
        System.out.println("Error message: " + errorMsg.getText());

    }
}
