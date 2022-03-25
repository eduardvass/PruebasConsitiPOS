package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GridPage;
import pages.TextSandBox;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the practice page$")
    public void navigateToPracticeSite(){
        grid.navigateToGridPage();
    }

    @And("^Go to Table test page$")
    public void goToTableExample(){
        grid.clickNextPageReference();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue(){
        String value = grid.getValueFromGrid(2,2);
        //System.out.println("Valor: "+value);

        Assert.assertEquals("Frank",value);
    }

    @Then("^I can validate the table is displayed$")
    public void theTableIsThere(){
        Assert.assertTrue("No se encontró", grid.cellStatus());
    }

}
