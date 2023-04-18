package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GridPage {
    WebDriver driver;

    @FindBy(css = "#menu > div > img")
    WebElement image;

    @FindBy(css = "#menu > div > h4")
    WebElement title;

    @FindBy(css = "#menu > div > button")
    WebElement button;

    @FindBy(css = "#menu > div > p")
    WebElement price;

    public GridPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getActualProductName(int productPosition) {
        String actualProductName= driver.findElement(By.xpath("//*[text()='"+productPosition+"']/../h4/b")).getText();
        return actualProductName;
    }
    public String getActualProductPrice(int productPosition) {
        String actualProductPrice= driver.findElement(By.xpath("//*[text()='"+productPosition+"']/../h4/b/../../p")).getText();
        return actualProductPrice;
    }

    public boolean GridAllItemsAvailableTest() {
       if( image.isDisplayed() && !title.getText().isEmpty() && !button.getText().isEmpty() && !price.getText().isEmpty()){
           return true;
       }else {
           return false;
       }
    }
}
