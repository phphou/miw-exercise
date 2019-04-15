package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.RitchieBros;

public class RitchieBrosTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.rbauction.com");
	}
		
	@Test(priority=1)
	public void verifyFirstResult() throws InterruptedException {
		RitchieBros rb = new RitchieBros(driver);
		String actualDetails = rb.search("excavtor", "Construction", "CATERPILLAR");
		Assert.assertNotEquals(actualDetails, "");
	}

	
}
