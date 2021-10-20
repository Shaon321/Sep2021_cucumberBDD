package stepDef;

import base.Setup;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObject.login_page;
import pageObject.profile_page;
import org.testng.Assert;

public class myProfile_step extends Setup {

    profile_page profile = new profile_page(driver);

    @Then("I should be able to successfully log in")
    public void iShouldBeAbleToSuccessfullyLogIn() {
        profile.successfullMsg();

//        profile.successfullMsg();
//        String abc = "Welcome to TalentTek";
//        Assert.assertEquals(abc,"Welcome to TalentTek");
    }
}
