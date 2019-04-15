package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Google;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1)
	public void verifyPageLoad() {
		if (driver.getTitle().contains("Not Found") || driver.getTitle().contains("Error")) {
			Assert.fail("Page load unsuccessful!");
		}
	}
	
	@Test(priority=2)
	public void verifyFirstResult() {
		Google google = new Google(driver);
		
		google.enterSearch("mobile integration workgroup");
		String actualLink = google.getFirstLinkResult();
		Assert.assertEquals(actualLink, "www.mobileintegrationsworkgroup.com");
	}

	
}
