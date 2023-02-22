package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage () {
		PageFactory.initElements(getDriver(), this);
		
	//we are implementing pagefactory class to initialize the ui element
		//using initElement method of PageFactory class
		//this method accept two parameters, first one is driver and this
		// we are refering to ui elements that will store in this class
		
	}
	
	@FindBy(xpath ="//h1[text()='Sign in']")
    public WebElement signPageLogo;
    @FindBy(id ="email")
    public WebElement emailField;
    @FindBy(id ="password")
    public WebElement passwordField;
    @FindBy(xpath ="//button[text()='Login']")
    public WebElement loginPageButton;
    @FindBy(linkText ="Create New Account")
    public WebElement createNewAccountButton;
    @FindBy(id ="newCompanyAccount")
    public WebElement  wantToSellSomethingLink;
   
}
