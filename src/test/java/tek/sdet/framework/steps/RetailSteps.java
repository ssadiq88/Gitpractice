package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailPage () {
		String actualTitle=getTitle();
		String expectedTitle="React App";
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual title"+ actualTitle + "Equal" + "ExpectedTitle" + expectedTitle);
		
		
	}
	@When("User search for {string} prodcut")
	public void userSearchForProduct(String productValue) {
		 sendText(factory.homePage().searchBar, productValue);
	        click(factory.homePage().searchButton);
	        logger.info("user searched for product "+ productValue );	
	}
	@Then ("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
        logger.info("the Product is displayed on home page");
		
	}

}
