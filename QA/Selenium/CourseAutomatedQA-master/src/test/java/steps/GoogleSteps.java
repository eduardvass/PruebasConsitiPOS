package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^Navego a Google$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^Busco algo$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Selenium");
    }

    @And("^Doy click al boton de busqueda$")
    public void clickSearchButton(){
        google.clickSearchButton();
    }

    @Then("^Obtengo resultados$")
    public void validateResults(){
        Assert.assertEquals("Texto esperado",google.firstResult());
    }
   
}
