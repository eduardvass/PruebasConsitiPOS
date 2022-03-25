package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AmazonPage;

public class AmazonSearchSteps {
    AmazonPage amazonPage = new AmazonPage();

    @Given("^The user navigates to Amazon page$")
    public void navigateToAmazon(){
        amazonPage.navigateToAmazonPage();
    }
    @And("^Searches for (.*)$")
    public void enterSearchCriteria(String criteria){
        amazonPage.enterSearchCriteria(criteria);
        amazonPage.searchClick();
    }


    @And("^Navigate to page (.*)$")
    public void navigateToSecondPage(String pageNumber){
        amazonPage.goToPage(pageNumber);
    }

    @And("^Selects the third Item$")
    public void selectThirdItem(){
        amazonPage.pickThirdItem();
    }

    @Then("^The User is able to add it to the cart$")
    public void itemCanBeAddedToCart(){
        amazonPage.addToCart();
        Assert.assertEquals("Agregado al carrito", amazonPage.addedToCartMessage());
    }
}
