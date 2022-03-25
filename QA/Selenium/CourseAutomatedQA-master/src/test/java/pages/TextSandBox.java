package pages;

import org.openqa.selenium.WebDriver;

public class TextSandBox extends BasePage{

    private String dropdownReference = "//a[contains(text(),'Dropdown')]",
    options = "//select[@id='dropdown']";

    public TextSandBox() {
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("http://the-internet.herokuapp.com/");
    }

    public void clickNextPageReference() {
        clickElement(dropdownReference);
    }

    public void selectOptionByValue(String option){
        selectFromDropdownByValue(options, option);
    }

    public void selectOptionByIndex(int index){
        selectFromDropdownByIndex(options, index);
    }

    public void selectOptionByText(String text){
        selectFromDropdownByText(options, text);
    }

}
