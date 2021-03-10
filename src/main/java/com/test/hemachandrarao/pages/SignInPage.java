package com.test.hemachandrarao.pages;

import com.test.hemachandrarao.context.ScenarioContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Hemanth on 03-04-2019.
 */
public class SignInPage extends PageBase {

    public SignInPage(ScenarioContext context) {
        super(context);
    }

    public WebElement signInLink(){
        return getWebElementVisible(By.xpath("//*[@class='login']"));
    }

    public WebElement username(){
        return getWebElementVisible(By.id("email"));
    }

    public WebElement password() {
        return getWebElementVisible(By.id("passwd"));
    }

    public WebElement signIn() {
        return getWebElementVisible(By.id("SubmitLogin"));
    }

    public WebElement personalInfo() {
        return getWebElementVisible(By.xpath("//*[@title='View my customer account']"));
    }

    public WebElement personalInfoTab() {
        return getWebElementVisible(By.xpath("//*[text()='My personal information']"));
    }

    public WebElement firstName() {
        return getWebElementVisible(By.id("firstname"));
    }

    public WebElement currentPassword() {
        return getWebElementVisible(By.name("old_passwd"));
    }

    public WebElement newPassword() {
        return getWebElementVisible(By.name("passwd"));
    }

    public WebElement confirmPassword() {
        return getWebElementVisible(By.name("confirmation"));
    }

    public WebElement save() {
        return getWebElementVisible(By.name("submitIdentity"));
    }
}
