package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='searchWord']")
    WebElement searchWords;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMessage() {
        searchWords.sendKeys( "for instance automation");
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Found one result for for instance automation']")));
        String resultMessage= driver.findElement(By.id("result")).getText();
        return resultMessage;
    }

    public String getRequiredMessage() {
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Please provide a search word.']")));
        String resultMessage= driver.findElement(By.id("result")).getText();
        return resultMessage;
    }
}
