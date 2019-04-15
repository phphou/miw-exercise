package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google {
	
	private WebDriver driver;
	
	// Locators
	By input = By.name("q");
	By results = By.className("srg");
	By firstLinkResult = By.xpath("//*[@class='srg']/div[1]/link");
	
	public Google(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSearch(String query) {
		driver.findElement(input).sendKeys(query);
		driver.findElement(input).sendKeys(Keys.ENTER);
	}
	
	public String getFirstLinkResult() {
		return driver.findElement(firstLinkResult).getAttribute("href");
	}
	
}
