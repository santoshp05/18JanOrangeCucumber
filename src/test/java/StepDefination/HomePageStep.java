package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStep extends BaseClass{

	protected static HomePage obj;
	
	
	@Then("User Validate url")
	public void user_validate_url() {
		obj=new HomePage();
		String url=obj.validatergetCurrenturl();
		Assert.assertEquals(url.contains("orange") ,true);
	}
	
 
	@Then("Validate get Title")
	public void validate_get_title() {
		 String title=obj.validatergettitle();
		   Assert.assertEquals(("OrangeHRM"), title);
	}
}
