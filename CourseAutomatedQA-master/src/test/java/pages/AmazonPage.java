package pages;

import org.openqa.selenium.WebDriver;

public class AmazonPage extends BasePage {

    public String   searchBox="//input[@id='twotabsearchtextbox']",
                    searchButton="//input[@id='nav-search-submit-button']",
                    resultListElements="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]",
                    thirdResult="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]",
                    addToCartButton="//input[@id='add-to-cart-button']",
                    addedMessageText="//span[contains(text(),'Agregado al carrito')]";

    public AmazonPage() {
        super(driver);
    }

    public void navigateToAmazonPage(){
        navigateTo("https://www.amazon.com/");
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
    }

    public void searchClick(){
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber){
        goToLinkText(pageNumber);
    }

    public void pickThirdItem(){
        clickElement(thirdResult);
        //selectNthElement(resultListElements,3);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addedToCartMessage(){
        return getTextFromElement(addedMessageText);
    }
}
