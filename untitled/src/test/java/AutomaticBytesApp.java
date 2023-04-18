import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;

public class AutomaticBytesApp {
   /* private WebDriver driver;
    LoginPage loginPage = new LoginPage();
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/richa/home-test/untitled/src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void loginSuccess() {
        driver.get("http://localhost:3100/login");
        loginPage.enterUsername("johndoe19");
        loginPage.enterPassword("supersecret");
        loginPage.clickLoginButton();
        assert loginPage.getWelcomeMessage().contains("johndoe19");
    }
    @Test
    public void loginFailureA() {
        driver.get("http://localhost:3100/login");
        loginPage.enterUsername("wronguser");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLoginButton();
        assert loginPage.getErrorMessage().contains("WRONG CREDENTIALS");
    }
    @Test
    public void loginFailureB() {
        driver.get("http://localhost:3100/login");
        driver.findElement(By.id("signin-button")).click();
        WebElement errorMessage = driver.findElement(By.id("message"));
        assert errorMessage.getText().contains("FIELDS CAN NOT BE EMPTY");
    }
    @Test
    public void checkoutFormOrderSuccess() {
        driver.get("http://localhost:3100/checkout");
        driver.findElement(By.id("fname")).sendKeys("John");
        driver.findElement(By.id("cname")).sendKeys("John");
        driver.findElement(By.id("ccnum")).sendKeys("6537283765478398");
        driver.findElement(By.xpath("//*[text()=\"April\"]")).click();
        driver.findElement(By.id("expyear")).sendKeys("1010");
        driver.findElement(By.id("cvv")).sendKeys("1234");
        driver.findElement(By.id("email")).sendKeys("Jhon@gmai.com");
        driver.findElement(By.id("adr")).sendKeys("123 Main St");
        driver.findElement(By.id("city")).sendKeys("Anytown");
        driver.findElement(By.id("state")).sendKeys("CA");
        driver.findElement(By.id("zip")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        WebElement confirmationNumber = driver.findElement(By.id("order-confirmation"));
        assert !confirmationNumber.getText().isEmpty();
    }
    @Test
    public void checkoutFormAlert() {
        driver.get("http://localhost:3100/checkout");
        driver.findElement(By.id("fname")).sendKeys("John");
        driver.findElement(By.id("cname")).sendKeys("John");
        driver.findElement(By.id("ccnum")).sendKeys("6537283765478398");
        driver.findElement(By.xpath("//*[text()=\"April\"]")).click();
        driver.findElement(By.id("expyear")).sendKeys("1010");
        driver.findElement(By.id("cvv")).sendKeys("1234");
        driver.findElement(By.id("email")).sendKeys("Jhon@gmai.com");
        driver.findElement(By.id("adr")).sendKeys("123 Main St");
        driver.findElement(By.id("city")).sendKeys("Anytown");
        driver.findElement(By.id("state")).sendKeys("CA");
        driver.findElement(By.id("zip")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@checked and @name='sameadr']")).click();
        driver.findElement(By.xpath("//button[@class='btn']")).click();
        // Switch to the alert popup
        Alert alert = driver.switchTo().alert();
        assert alert.getText().contains("Shipping address same as billing checkbox must be selected");
        alert.accept();
    }
    @Test
    public void cartTotalTest() {
        driver.get("http://localhost:3100/checkout");
        int expectedTotal=0;
        for (int i = 1; i <= 4; i++) {
           String price= driver.findElement(By.xpath("//a[text()='Product "+i+"']/following-sibling::span")).getText().replace("$","");
            expectedTotal += Integer.parseInt(price) ;
        }
        int actualTotal = Integer.parseInt(driver.findElement(By.xpath("//p[text()='Total ']/span")).getText().replace("$",""));
        assert actualTotal == expectedTotal;
    }
    @Test
    public void GridItemTest() {
        driver.get("http://localhost:3100/grid");
        int productPosition=7;
        String actualProductName= driver.findElement(By.xpath("//*[text()='"+productPosition+"']/../h4/b")).getText();
        String actualProductPrice= driver.findElement(By.xpath("//*[text()='"+productPosition+"']/../h4/b/../../p")).getText();
        String expectedProductName="Super Pepperoni";
        String expectedProductPrice="$10";
        Assert.assertEquals(actualProductName, expectedProductName);
        Assert.assertEquals(actualProductPrice, expectedProductPrice);
    }
    @Test
    public void GridAllItemsTest() {
        driver.get("http://localhost:3100/grid");
        WebElement image = driver.findElement(By.cssSelector("#menu > div > img"));
        WebElement title = driver.findElement(By.cssSelector("#menu > div > h4"));
        WebElement button = driver.findElement(By.cssSelector("#menu > div > button"));
        WebElement price = driver.findElement(By.cssSelector("#menu > div > p"));
        assert image.isDisplayed();
        assert !title.getText().isEmpty();
        assert !button.getText().isEmpty();
        assert !price.getText().isEmpty();
    }
    @Test
    public void SearchSuccess() {
        driver.get("http://localhost:3100/search");
        String searchWord="for instance automation";
        driver.findElement(By.xpath("//input[@name='searchWord']")).sendKeys(searchWord);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Found one result for for instance automation']")));
        String resultMessage= driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultMessage,"Found one result for "+searchWord+ "");
    }
    @Test
    public void SearchEmpty() {
        driver.get("http://localhost:3100/search");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Please provide a search word.']")));
        String resultMessage= driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultMessage,"Please provide a search word.");
    }*/
}
