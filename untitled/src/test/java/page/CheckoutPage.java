package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id = "fname")
    WebElement fname;

    @FindBy(id = "cname")
    WebElement cname;

    @FindBy(id = "ccnum")
    WebElement ccnum;

    @FindBy(id = "expyear")
    WebElement expyear;

    @FindBy(id = "cvv")
    WebElement cvv;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "adr")
    WebElement adr;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "zip")
    WebElement zip;

    @FindBy(xpath = "//input[@name='sameadr']")
    WebElement sameadr;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement btn;

    @FindBy(xpath = "//*[text()=\"April\"]")
    WebElement date;

    @FindBy(xpath ="//p[text()='Total ']/span")
    WebElement actualTot;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillCheckoutSuccesForm(String firstName, String lastName, String cnum, String xpyear,
                                 String cvvv, String mail, String addr, String cit,String statte,String zipp) {
        fname.sendKeys(firstName);
        cname.sendKeys(lastName);
        ccnum.sendKeys(cnum);
        date.click();
        expyear.sendKeys(xpyear);
        cvv.sendKeys(cvvv);
        email.sendKeys(mail);
        adr.sendKeys(addr);
        city.sendKeys(cit);
        state.sendKeys(statte);
        zip.sendKeys(zipp);
        btn.click();
    }
    public void fillCheckoutForm(String firstName, String lastName, String cnum, String xpyear,
                                       String cvvv, String mail, String addr, String cit,String statte,String zipp) {
        fname.sendKeys(firstName);
        cname.sendKeys(lastName);
        ccnum.sendKeys(cnum);
        date.click();
        expyear.sendKeys(xpyear);
        cvv.sendKeys(cvvv);
        email.sendKeys(mail);
        adr.sendKeys(addr);
        city.sendKeys(cit);
        state.sendKeys(statte);
        zip.sendKeys(zipp);
        sameadr.click();
        btn.click();
    }

    public int getPrice() {
        int expectedTotal=0;
        for (int i = 1; i <= 4; i++) {
            String price= driver.findElement(By.xpath("//a[text()='Product "+i+"']/following-sibling::span")).getText().replace("$","");
            expectedTotal += Integer.parseInt(price) ;
        }
        return  expectedTotal;
    }
    public int getTotal(){
     int actualTotal = Integer.parseInt(actualTot.getText().replace("$",""));
     return  actualTotal;
       }
}
