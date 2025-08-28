package Maven_examples;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Chechbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		System.out.println("driver set up done");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		//code for select all;
	 /*String [] val = {"0","1","2"};
	 for(String n : val) {
		WebElement Send_To_Checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='" +n+"']"));
		if(Send_To_Checkbox.isEnabled()) {
			Send_To_Checkbox.click();}}*/
		WebElement Send_To_Checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='1']"));
		if(Send_To_Checkbox.isEnabled() && !Send_To_Checkbox.isSelected()) {
			Thread.sleep(200);
			Send_To_Checkbox.click();}
		Thread.sleep(3000);
		
	driver.close();
		
	}

}
