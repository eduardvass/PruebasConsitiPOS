package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TextSandBox;

public class TestSandboxSteps {

    TextSandBox sandBoxPage = new TextSandBox();

    @Given("^I navigate to the sandbox page$")
    public void navigateToSandBoxSite(){
        sandBoxPage.navigateToSandbox();
    }

    @And("^Go to dropdown page$")
    public void goToDropdownExample(){
        sandBoxPage.clickNextPageReference();
    }

    @And("^Select a value from a dropdown$")
    public void selectState(){
        sandBoxPage.selectOptionByText("Option 2");
    }
}
