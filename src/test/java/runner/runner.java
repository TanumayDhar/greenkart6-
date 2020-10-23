package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\tanumay123\\Desktop\\Cucumber\\Workspace_photon\\GreenKart6\\src\\test\\java\\features",
glue="StepDefinations", monochrome=true,tags= {"@Sanity,@Smoke,@Regression"},plugin= {"pretty","html:target/cucumberReport","json:target/cucumber.json","junit:target/cukes.xml"})
public class runner {

}
