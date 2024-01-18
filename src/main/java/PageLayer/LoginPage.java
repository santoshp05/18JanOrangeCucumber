package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="username")
	private WebElement fname;
	

	@FindBy(name="password")
	private WebElement lname;
	

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunctionality(String Fname,String Lname) {
		UtilsLayer.wait.sendKeys(fname, Fname);
		UtilsLayer.wait.sendKeys(lname, Lname);
	}
	
	public void clickOnLogin() {
		UtilsLayer.wait.click(login);
	}
	

}
