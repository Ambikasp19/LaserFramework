package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 
	@FindBy(xpath="//*[@id=\"onetrust-accept-btn-handler\"]")

    WebElement Acceptcookies;
	
	@FindBy(xpath="//*[@id=\"password\"]")

    WebElement password;
	
	@FindBy(xpath="//*[@id=\"email\"]")

    WebElement Username;
	

	@FindBy(xpath="//*[@type=\"submit\"]")

    WebElement Submit;
	
	@FindBy(xpath="//*[text()=\"Create a new company account\"]")

    WebElement Radiobutton;
	
	@FindBy(xpath="//*[text()=\"Continue\"]")

    WebElement continuebutton;
	
	@FindBy(xpath="//*[text()=\"companyName\"]")

    WebElement companyName;
	
	@FindBy(xpath="//*[@name=\"role\"]")

    WebElement dropdown;  
	
	
	public void Verify_homePage()
	{
		password.isDisplayed();
		Username.isDisplayed();
		Submit.isDisplayed();
		
	}

	public void EnterUsername(String name) throws InterruptedException
	{
		
		Acceptcookies.click();
		Thread.sleep(5000);
		Username.sendKeys(name);
		
	}
	
	public void EnterPassword(String name)
	{
		password.sendKeys(name);
		
	}
	
	public void submit()
	{
		Submit.click();
		
	}
	
	public void ClickonRadioButton()
	{
		Radiobutton.click();
		
	}
	
	public void ClickoncontinueButton()
	{
		continuebutton.click();
		
	}
	
	public void Enter_companyName(String Name)
	{
		companyName.sendKeys(Name);
		
	}
	 
	public void Dropdown()
	{
		Select dd =new Select(dropdown);
		dd.selectByVisibleText("General manager");
	}
	
	
	
}
