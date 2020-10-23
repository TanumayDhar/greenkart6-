package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {
	
	public WebDriver driver;
	
	public CheckOut(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	
	By cartImage= By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
	By proceed = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By itemDisplay = By.cssSelector("p.product-name");
	By proceedOrdr = By.xpath("//button[contains(text(),'Place Order')]");
	
	
	public WebElement cartIconClick()
	{
		
		 return driver.findElement(cartImage);
		
	}
	
	public WebElement proceedToCheckOut()
	{
		
		 return driver.findElement(proceed);
		
		
	}

	public WebElement itemDisplayCheckOut()
	{
		
		 return driver.findElement(itemDisplay);
		
	}
	public WebElement proceedOrder()
	{
		
		return driver.findElement(proceedOrdr);
		
	}

}
