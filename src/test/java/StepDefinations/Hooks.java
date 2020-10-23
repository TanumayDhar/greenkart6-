package StepDefinations;
import Base.BaseClass;
import cucumber.api.java.After;

public class Hooks extends BaseClass{

	@After("@Smoke,@Sanity,@Regression")
	public void CucumberHooks()
	{
		driver.close();

	}
	
	

}
