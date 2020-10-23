package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProccedToBuy {
	
	public WebDriver driver;
	
	public ProccedToBuy(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	By country = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select");
	By checkBox = By.xpath("//input[@class='chkAgree']");
	By proButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	
	public WebElement ChooseCountry()
	{
		
		return driver.findElement(country);
		
	}
	
	public WebElement selectTermsCond()
	{
		
		return driver.findElement(checkBox);
		
	}
	
	public WebElement clickButton()
	{
		
		return driver.findElement(proButton);
	}

}
