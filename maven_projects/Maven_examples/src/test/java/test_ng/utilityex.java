package test_ng;
import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class utilityex {

	    public static String expUrl = "https://www.mycontactform.com/";
	    public static String actTitle = "Free Contact and Email Forms - myContactForm.com";
	    private static WebDriver driver;

	    // ✅ Launch browser
	    public static WebDriver startBrowser(String browserType) {

	        if (browserType.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--incognito", "--start-maximized");
	            driver = new ChromeDriver(options);

	        } else if (browserType.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();

	        } else if (browserType.equalsIgnoreCase("edge")) {
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        }

	        // Open app
	        driver.manage().window().maximize();
	        driver.get(expUrl);

	        // ✅ Validate
	        String pageTitle = driver.getTitle();
	        System.out.println("Page Title: " + pageTitle);
	        if (actTitle.equals(pageTitle)) {
	            System.out.println("✅ Title matched");
	        } else {
	            System.out.println("❌ Title mismatch");
	        }

	        String actUrl = driver.getCurrentUrl();
	        System.out.println("URL: " + actUrl);
	        if (expUrl.equals(actUrl)) {
	            System.out.println("✅ URL verified");
	        } else {
	            System.out.println("❌ URL mismatch");
	        }

	        return driver;
	    }

	    // ✅ Close browser
	    public static void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    // ✅ Getter
	    public static WebDriver getDriver() {
	        return driver;
	    }
	}



