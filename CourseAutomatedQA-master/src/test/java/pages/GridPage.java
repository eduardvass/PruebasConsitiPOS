package pages;

public class GridPage extends BasePage {

    public GridPage() {
        super(driver);
    }

    private String tablePageReference = "//a[contains(text(),'Sortable Data Tables')]",
    tableContainer = "//body/div[2]/div[1]/div[1]",
    mainTable = "//table[@id='table1']";

    public void navigateToGridPage(){
        navigateTo("http://the-internet.herokuapp.com/");
    }

    public void clickNextPageReference() {
        clickElement(tablePageReference);
    }

    public String getValueFromGrid(int row, int column){
        return getValueFromTable(tableContainer, row, column);
    }

    public boolean cellStatus(){
        return elementIsDisplayed(mainTable);
    }


}
