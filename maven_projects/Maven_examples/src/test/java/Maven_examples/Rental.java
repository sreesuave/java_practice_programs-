package Maven_examples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Rental {
    public static void main(String[] args) {
    	WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.mycontactform.com/samples/rental.php");
        driver.getTitle();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
        	WebElement mr = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/select/option[2]"));
        	mr.click();
        	WebElement firstname = driver.findElement(By.xpath("//*[@id=\"q[1]\"]"));
        	firstname.sendKeys("john");
        	WebElement lastname = driver.findElement(By.xpath("//*[@id=\"q[2]\"]"));
        	lastname.sendKeys("bravo");
        	WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        	email.sendKeys("sampleuser@gmail.com");
        	WebElement phne = driver.findElement(By.xpath("//*[@id=\"q[3]\"]"));
        	phne.sendKeys("9898745634");
        	WebElement Preferred_Contact_Method  = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[7]/td/font/input[2]"));
        	Preferred_Contact_Method.click();
        	WebElement Contact_time  = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[9]/td/font/input[1]"));
        	Contact_time.click();
        	WebElement Date_of_Planned_Move = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td[2]/font/select/option[4]"));
        	Date_of_Planned_Move.click();
        	WebElement family = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[11]/td[2]/font/select/option[4]"));
        	family.click();
        	WebElement price_min = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[13]/td[2]/font/select/option[5]"));
        	price_min.click();
        	WebElement price_max = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[14]/td[2]/font/select/option[8]"));
        	price_max.click();
        	WebElement square_min = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[15]/td[2]/font/select/option[5]"));
        	square_min.click();
        	WebElement square_max = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[16]/td[2]/font/select/option[10]"));
        	square_max.click();
        	WebElement preferred_area = driver.findElement(By.xpath("//*[@id=\"q[11]\"]"));
        	preferred_area.sendKeys("skypia");
        	WebElement min_bed = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[18]/td[2]/font/select/option[2]"));
        	driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/table/tbody/tr[27]/td/input[1]")).click();
        	 
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
           // driver.quit();
        }
    }
}
