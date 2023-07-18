package com.airlinesproject.demo.pages;

import com.airlinesproject.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@for='mat-radio-2-input']//span[@class='mat-radio-outer-circle']")
    WebElement oneway ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='From']")
    WebElement from;

    @CacheLookup
    @FindBy(xpath = "//input[@id='To']")
    WebElement to;

    @CacheLookup
    @FindBy(xpath = "//button[@class='show-flight-btn col-lg-5 col-12 booking-flight-btn text-uppercase ng-star-inserted']")
    WebElement button;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Change the Way you Travel']")
    WebElement text;

    public void sendTextToFromField(){
        clickOnElement(from);
        from.sendKeys( Keys.DOWN, Keys.ENTER);
    }

    public void sendTextToToField(){
        //sendTextToElement(to,toField);
        clickOnElement(to);
        to.sendKeys( Keys.DOWN, Keys.DOWN, Keys.ENTER);
    }

    public void clickOnOneWay(){
        clickOnElement(oneway);
    }

    public void showFlights(){
        clickOnElement(button);

    }

    public String assertMethod(){
    return text.getText();
    }

}