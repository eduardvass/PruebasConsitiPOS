package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

//{"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    monochrome = true,
    tags = "@List",
    publish = true

)
public class runner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.cleanBrowser();
    }
}