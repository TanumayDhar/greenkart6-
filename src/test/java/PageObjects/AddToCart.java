package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class AddToCart {
	
	
	public WebDriver driver;


	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By addQ= By.cssSelector("a.increment");
	By addCart= By.xpath("//button[text()='ADD TO CART']");

	public WebElement addQuantity()
	{

		return driver.findElement(addQ);
	}


	public WebElement addToCart()
	{

		return driver.findElement(addCart);

	}
}
