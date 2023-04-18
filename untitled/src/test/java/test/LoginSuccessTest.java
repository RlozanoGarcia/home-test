package test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginSuccessTest {
    WebDriver driver;
    LoginPage loginPage;
    String baseUrl = "http://localhost:3100/login";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/richa/home-test/untitled/src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void checkoutFormOrderSuccess() {
        loginPage.login("johndoe19", "supersecret");
        Alert alert = driver.switchTo().alert();
        assert alert.getText().contains("Shipping address same as billing checkbox must be selected");
        alert.accept();
    }
    @Test
    public void loginFailureA() {
        loginPage.login("wrongUser", "wrongPassword");
        String wrongMessage = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(wrongMessage.contains("WRONG CREDENTIALS"));
    }
    @Test
    public void loginFailureB() {
        loginPage.login("", "");
        String welcomeMessage = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(welcomeMessage.contains("FIELDS CAN NOT BE EMPTY"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
