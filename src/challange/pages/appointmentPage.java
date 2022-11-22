package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;


public class appointmentPage extends BrowserUtils{
 public appointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    String expextedPetName= "Hook";
    String expectedName="John";
    String expectedDate="2021-09-10";
    String expectedTime="10:30";
    String expectedSymptoms="Solo Duerme";


    @FindBy(css="input[type='text']")
    private WebElement petName;
    @FindBy(xpath="//form//input[2]")
    private WebElement ownerName;
    @FindBy(xpath="//form//input[3]")
    private WebElement date;
    @FindBy(xpath="//form//input[4]")
    private WebElement time;
    @FindBy(xpath="//form//textarea")
    private WebElement symptoms;
    @FindBy(xpath = "//form//button")
    private WebElement button;

    public void setPetName() {
        petName.sendKeys("Hook");
    }

    public void setCustomerName() {
      ownerName.sendKeys("John");
    }

    public void setDate() {
        date.click();
        date.sendKeys("2021");
        BrowserUtils.staticWait(2);
        date.sendKeys(Keys.RIGHT);
        BrowserUtils.staticWait(2);
        date.sendKeys("09");
        BrowserUtils.staticWait(2);
        date.sendKeys("10");



    }

    public void setTime() {
        time.sendKeys("10:30A");
    }

    public void setSymptoms() {
        symptoms.sendKeys("Solo Duerme");

    }

    public void clickButton() {
        button.click();

    }




}
