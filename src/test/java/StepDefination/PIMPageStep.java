package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStep extends BaseClass {
	protected static PIMPage pimpage;
	
	@When("User Click on PIM button")
	public void user_click_on_pim_button() throws InterruptedException {
		 pimpage = new PIMPage();
		pimpage.clickPim();

	}
	@Then("click on AddEmployee")
	public void click_on_add_employee() throws InterruptedException {
		pimpage.addEmployee();
	}
	@Then("Enter FirstName , LastName and Save button")
	public void enter_first_name_last_name_and_save_button() throws InterruptedException {
	pimpage.pimPageFunactionality("Abc", "Xyz");
	}

}
