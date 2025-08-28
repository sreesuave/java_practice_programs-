package Maven_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Form {
	

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		System.out.println("driver set up done");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
		
		WebElement UserName = driver.findElement(By.name("username"));
		// send the login username and password that we already created.
		UserName.sendKeys("sridhar3445ce");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("#sre123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();

		
		
		

	}

}
