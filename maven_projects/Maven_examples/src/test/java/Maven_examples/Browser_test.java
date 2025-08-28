package Maven_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser_test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.out.print("driver setuped");
		WebDriver  driver = new ChromeDriver();
		driver.navigate().to("https://www.mycontactform.com/");
		System.out.println("website opened");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		//driver.close();
	//driver.navigate().forward();
		WebElement usernameelement = driver.findElement(By.name("user"));
		usernameelement.sendKeys("admin");
		WebElement userpasswordlement = driver.findElement(By.name("pass"));
		userpasswordlement.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.name("btnSubmit"));
		loginButton.click();
		driver.close()
;		
		}

}
