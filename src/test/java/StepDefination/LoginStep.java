package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	public static LoginPage log;
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		BaseClass.initalization();
	   
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		 log= new LoginPage();
		 log.LoginFunctionality("Admin", "admin123");
	    
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	    log.clickOnLogin();
	}

}
