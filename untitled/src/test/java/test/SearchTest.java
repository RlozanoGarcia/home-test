package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SearchPage;

public class SearchTest {
    WebDriver driver;
    SearchPage searchPage;
    String baseUrl = "http://localhost:3100/search";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/richa/home-test/untitled/src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        searchPage = new SearchPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void SearchSuccess() {
        String searchWord="for instance automation";
        Assert.assertEquals(searchPage.getMessage(),"Found one result for "+searchWord+ "");
    }
    @Test
    public void SearchEmpty() {
        Assert.assertEquals(searchPage.getRequiredMessage(),"Please provide a search word.");
    }
}
