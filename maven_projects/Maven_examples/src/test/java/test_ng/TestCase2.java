package test_ng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

    static String baseUrl = "https://www.google.com/";
    static String expTitle = "Google";

    // Browsers to test
    String[] multiBrowser = {"chrome", "firefox", "edge"};

    @Test
    public void testMainPage() {
        for (String browser : multiBrowser) {
            WebDriver driver = BrowserFactory.startBrowser(browser, baseUrl);

            String actTitle = driver.getTitle();
            System.out.println("Browser: " + browser + " | Title: " + actTitle);

            // Flexible assertion
            Assert.assertTrue(actTitle.contains(expTitle),
                    "❌ Title mismatch on " + browser + " | Found: " + actTitle);

            BrowserFactory.closeBrowser();
        }
    }
}
