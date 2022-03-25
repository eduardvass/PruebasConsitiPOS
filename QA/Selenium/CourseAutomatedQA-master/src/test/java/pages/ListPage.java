package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListPage extends BasePage{

    public ListPage() {
        super(driver);
    }

    String searchField = "//body/form[1]/input[1]",
            searchResults = "name";

    public void navigateToListPage(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria(String entry) throws InterruptedException {
        try {
            write(searchField, entry);
            Thread.sleep(600);
        } catch (NoSuchElementException e) {
            System.out.println("The WebElement searchField couldn't be found.");
            e.printStackTrace();
        }


    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = getAllElementsFromList(searchResults);
        List<String> stringsFromList = new ArrayList<>();

        for (WebElement e :
                list) {
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }
}
