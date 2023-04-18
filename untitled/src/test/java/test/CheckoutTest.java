package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CheckoutPage;
import page.LoginPage;

public class CheckoutTest {
    WebDriver driver;
    CheckoutPage checkoutPage;
    String baseUrl = "http://localhost:3100/checkout";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/richa/home-test/untitled/src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void testLoginSuccess() {
        checkoutPage.fillCheckoutSuccesForm("John", "Jhon","6537283765478398",
                "1010","123","richard@gmail.com","prueba","prueba","Lima","12345");
        String welcomeMessage = driver.findElement(By.id("order-confirmation")).getText();
        assert !welcomeMessage.isEmpty();
    }
    @Test
    public void checkoutFormAlert() {
        checkoutPage.fillCheckoutForm("John", "Jhon","6537283765478398",
                "1010","123","richard@gmail.com","prueba","prueba","Lima","12345");
        Alert alert = driver.switchTo().alert();
        assert alert.getText().contains("Shipping address same as billing checkbox must be selected");
        alert.accept();
    }

    @Test
    public void cartTotalTest() {
       int actualTotal= checkoutPage.getPrice();
       int expectedTotal=  checkoutPage.getTotal();
       assert actualTotal == expectedTotal;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
