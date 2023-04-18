package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.GridPage;

public class GridTest {
    WebDriver driver;
    GridPage gridPage;
    String baseUrl = "http://localhost:3100/grid";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/richa/home-test/untitled/src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        gridPage = new GridPage(driver);
    }

    @Test
    public void GridItemTest() {
        Assert.assertEquals(gridPage.getActualProductName(7), "Super Pepperoni");
        Assert.assertEquals(gridPage.getActualProductPrice(7), "$10");
    }
    @Test
    public void GridAllItemsTest() {
        Assert.assertTrue(gridPage.GridAllItemsAvailableTest());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
