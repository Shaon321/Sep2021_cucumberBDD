package pageObject;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profile_page extends Setup {

    public profile_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }

    // locators
    @FindBy(how= How.CSS, using = "#profile_form > legend")
    public WebElement getMessage;


    // Function
    public void successfullMsg(){
        String expMsg = "Welcome 2 TalentTek";
        String actMsg = getMessage.getText();
        Assert.assertEquals(expMsg, actMsg);
       // getMessage.getText();
    }

}