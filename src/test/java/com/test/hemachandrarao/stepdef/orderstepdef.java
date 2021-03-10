package com.test.hemachandrarao.stepdef;

import com.test.hemachandrarao.context.ScenarioContext;
import com.test.hemachandrarao.pages.SignInPage;
import com.test.hemachandrarao.pages.TshirtPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class orderstepdef {

    ScenarioContext context;
    TshirtPage tshirtPage;
    SignInPage signInPage;

    public orderstepdef(ScenarioContext context){
        this.context = context;

    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
        context.getDriver().get("http://automationpractice.com/");
        tshirtPage = new TshirtPage(context);
        signInPage = new SignInPage(context);
    }

    @When("I order a tshirt")
    public void iOrderATshirt() {
        tshirtPage.tshirtTab().click();
//        tshirtPage.tShirtImage().click();
        tshirtPage.addToCart().click();
        for(int i = 0; i < 3;i++){
            tshirtPage.proceedToCheckout().click();
        }
        tshirtPage.agreeTermsAndCondition().click();
        tshirtPage.proceedToCheckout().click();
        tshirtPage.payByCheck().click();
        tshirtPage.confirmOrder().click();
        tshirtPage.backToOrder().click();
    }

    @Then("I should see my order in order history")
    public void iShouldSeeMyOrderInOrderHistory() {
        Assert.assertTrue(tshirtPage.orders().size() > 0);
    }

    @When("I sign in")
    public void iSignIn() {
        signInPage.signInLink().click();
        signInPage.username().sendKeys("testuser03@gmail.com");
        signInPage.password().sendKeys("qualitest");
        signInPage.signIn().click();
    }

    @And("I update my personal information")
    public void iUpdateMyPersonalInformation() {
        signInPage.personalInfo().click();
        signInPage.personalInfoTab().click();
        signInPage.firstName().clear();
        signInPage.firstName().sendKeys("testuser changed");
        signInPage.currentPassword().sendKeys("qualitest");
        signInPage.newPassword().sendKeys("qualitest");
        signInPage.confirmPassword().sendKeys("qualitest");
        signInPage.save().click();
    }

    @Then("my personal information is saved")
    public void myPersonalInformationIsSaved() throws InterruptedException {
        System.out.println("+=+++++++++++++"+signInPage.personalInfo().getText());
        for(int i = 0; i < 5; i++) {
            if(signInPage.personalInfo().getText().contains("Changed")){
                Assert.assertTrue(true);
            }else{
                Thread.sleep(1000);
            }
        }
        Assert.assertTrue(signInPage.personalInfo().getText().contains("Changed"));
    }

    @After
    public void closeDriver(){
        context.getDriver().quit();
    }
}
