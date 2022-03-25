package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        monochrome = true,
        tags = "@Employee",
        publish = true

)

public class runner {

    @AfterClass
    public static void cleanDriver(){
        BasePage.cleanBrowser();
    }

}
