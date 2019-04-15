package pages;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RitchieBros {

	private WebDriver driver;
	
	// Locators
	By searchText = By.id("adv-keyword");
	By advSearchBtn = By.id("adv-toggle-down");
	By categoryInput = By.xpath("//*[@id='react-select-3--value']/div[@class='Select-input']/input");
	By searchBtn = By.id("adv-submit-button");
	By yearText = By.id("adv-year-min");
	By make = By.id("adv-make");
	By firstResult = By.xpath("//*[@id='searchResultsList']/div[1]/div/main/p[contains(@id, 'ci_details')]");
	
	public RitchieBros(WebDriver driver) {
		this.driver = driver;
	}
	
	public String search(String keyword, String category, String maker) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR) - 3;
		
		driver.findElement(advSearchBtn).click();
		driver.findElement(searchText).sendKeys(keyword);
		driver.findElement(categoryInput).sendKeys(category);
		driver.findElement(make).sendKeys(maker);
		driver.findElement(yearText).sendKeys(Integer.toString(year));
		driver.findElement(searchBtn).click();
		
		// Print "Details" of first result 
		String details = driver.findElement(firstResult).getText();
		System.out.println(details);
		return details;
	}
}
