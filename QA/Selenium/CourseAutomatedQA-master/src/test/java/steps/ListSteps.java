package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ListPage;

import java.util.List;

public class ListSteps {

    ListPage listPage = new ListPage();

    @Given("^I navigate to the list page$")
    public void navigateToSite(){
        listPage.navigateToListPage();
    }

    @When("^I search (.+) in the list$")
    public void enterSearchCriteria(String entry) throws InterruptedException{

        listPage.enterSearchCriteria(entry);

    }

    @Then("^I can find (.+) in the list$")
    public void findOnTheList(String result){
        List<String> lista = listPage.getAllSearchResults();

        boolean textIsThere = lista.contains(result);

        //Assert.assertTrue("No hay resultados de la busqueda", textIsThere);

        if(textIsThere){
            System.out.println("Text is on the list");
        }else{
            throw new Error("The text is not on the list");
        }

    }

}
