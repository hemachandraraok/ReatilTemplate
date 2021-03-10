package com.test.hemachandrarao.pages;

import com.test.hemachandrarao.context.ScenarioContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Hemanth on 03-04-2019.
 */
public class TshirtPage extends PageBase {

    public TshirtPage(ScenarioContext context) {
        super(context);
    }

    public WebElement tshirtTab(){
        return getWebElementVisible(By.xpath("(//a[@title='T-shirts'])[2]"));
    }


    public WebElement addToCart() {
        return getWebElementVisible(By.xpath("//*[text()='Add to cart']"));
    }

    public WebElement proceedToCheckout() {
        return getWebElementVisible(By.xpath("(//*[contains(text(),'Proceed to checkout')])[last()]"));
    }

    public WebElement agreeTermsAndCondition() {
        return getWebElementVisible(By.id("cgv"));
    }

    public WebElement payByCheck() {
        return getWebElementVisible(By.xpath("//a[@title='Pay by check.']"));
    }

    public WebElement confirmOrder() {
        return getWebElementVisible(By.xpath("//*[text()='I confirm my order']"));
    }

    public WebElement backToOrder() {
        return getWebElementVisible(By.xpath("//a[@title='Back to orders']"));
    }

    public List<WebElement> orders() {
        return getWebElementsVisible(By.xpath("//*[@class='color-myaccount']"));
    }

}
