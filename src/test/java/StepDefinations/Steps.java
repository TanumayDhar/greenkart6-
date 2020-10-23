package StepDefinations;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Base.BaseClass;

import PageObjects.AddToCart;
import PageObjects.CheckOut;
import PageObjects.HomePage;
import PageObjects.ProccedToBuy;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {

	public WebDriver driver;
	HomePage hp;
	AddToCart ad;
	CheckOut ch;
	ProccedToBuy pb;

	//from baseClass
	@Given("^User navigated to the GreenKart landing page$")
	public void user_navigated_to_the_greenkart_landing_page() throws Throwable {

		driver=BaseClass.getDriver();

	}
	//from HomePage
	@When("^user searched for \"([^\"]*)\" vegetable$")
	public void user_searched_for_something_vegetable(String cucumber) throws Throwable {

		hp=new HomePage(driver);
		hp.getSearch().sendKeys(cucumber);
		Thread.sleep(2000);
	}
	//from HomePage
	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String strArg1 ) throws Throwable {

		Thread.sleep(2000);

		Assert.assertTrue(hp.verifyDisplayResults().getText().contains(strArg1));


	}
	//From AddToCart
	@And("^added items to cart$")
	public void added_items_to_cart() throws Throwable {
		Thread.sleep(2000);
		ad=new AddToCart(driver);
		ad.addQuantity().click();
		ad.addToCart().click();

	}
	//From checkOut
	@Then("^verify selected \"([^\"]*)\" items are displayed in check out page$")
	public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {

		Thread.sleep(2000);
		Assert.assertTrue(ch.itemDisplayCheckOut().getText().contains(strArg1));


	}

	//From CheckOut
	@And("^user proceed to checkout page for purchase$")
	public void user_proceed_to_checkout_page_for_purchase() throws InterruptedException {

		ch=new CheckOut(driver);
		ch.cartIconClick().click();
		Thread.sleep(2000);
		ch.proceedToCheckOut().click();
	}
	//From CheckOut
	@And("^user clicked on place order$")
	public void user_clicked_on_place_order() throws Throwable {

		ch.proceedOrder().click();

	}
	//From ProceedToBuy
	@And("^user select country as \"([^\\\"]*)\"")
	public void user_select_country_as_australia(String arg) throws Throwable {
		Thread.sleep(2000);
		pb=new ProccedToBuy(driver);

		Thread.sleep(2000);
		Select country= new Select(pb.ChooseCountry());
		country.selectByVisibleText(arg);



	}
	//From ProceedToBuy
	@And("^clicked on check box and proceed for order$")
	public void clicked_on_check_box_and_proceed_for_order() throws Throwable {
		Thread.sleep(2000);
		pb.selectTermsCond().click();

		pb.clickButton().click();


	}
	//from HomePage
	@Then("^verify order successfull.$")
	public void verify_order_successfull() throws Throwable {
		Thread.sleep(3000);
		hp.veriFyOrderScuccess();


	}
}





