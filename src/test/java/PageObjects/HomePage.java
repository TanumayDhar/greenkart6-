package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;

	}

	
	By search= By.xpath("//input[@class='search-keyword']");

	By verfyDisplayResults = By.cssSelector("h4.product-name");

	
	public WebElement getSearch() throws InterruptedException
	{

		return driver.findElement(search);
	}

	public WebElement verifyDisplayResults()
	{

		return driver.findElement(verfyDisplayResults);


	}
	
	public void veriFyOrderScuccess()
	{
		
		String actual = "GreenKart - veg and fruits kart";
		Assert.assertEquals(actual, driver.getTitle());
	}

	public void topDeals()
	{


	}

	public void itemPrice()
	{



	}

	public void flightBooking()
	{



	}


}
