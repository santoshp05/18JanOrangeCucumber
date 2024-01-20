package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PimLink;

	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement Addemp;
	
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement save;

	public PIMPage()
	{
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickPim() throws InterruptedException
	{
		Thread.sleep(3000);
		UtilsLayer.wait.click(PimLink);
		
	}

public void addEmployee() throws InterruptedException
{
	Thread.sleep(5000);
	UtilsLayer.wait.click(Addemp);
}
	public void pimPageFunactionality(String Fname, String Lname) throws InterruptedException
	{
		Thread.sleep(3000);
		UtilsLayer.wait.sendKeys(firstname, Fname);
		UtilsLayer.wait.sendKeys(lastName, Lname);
		UtilsLayer.wait.click(save);
	}
	
}
