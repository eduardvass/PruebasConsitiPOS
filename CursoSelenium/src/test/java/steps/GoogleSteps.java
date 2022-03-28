package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^navego a google$")
    public void navegoGoogle(){

        google.navigateToGoogle();

    }

    @When("^busco algo$")
    public void buscoAlgo(){

    }
    @And("^click en el boton buscar$")
    public void clickBotonBuscar(){

    }
    @Then("^obtengo resultados$")
    public void obtenerResultados(){

    }
}
