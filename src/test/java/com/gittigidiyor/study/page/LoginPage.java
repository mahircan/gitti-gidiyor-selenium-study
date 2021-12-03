package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By loginContainerLocator = By.id("L-UserNameField");
    By passwordContainerLocator = new By.ByCssSelector("input[type='password']");
    By loginButtonLocator = new By.ByCssSelector("input[class='gg-m-24 gg-t-24 gg-d-24 gg-w-24 gg-ui-btn-primary gg-ui-btn-fluid  gg-ui-btn-lg']");
    By checkLoginLocator = new By.ByCssSelector("div[class='faux-fb-btn']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginWith(String userMail, String userPassword){
        wait(5,loginContainerLocator);
        find(loginContainerLocator).sendKeys(userMail);
        find(passwordContainerLocator).sendKeys(userPassword);
        find(loginButtonLocator).click();
    }
    public boolean isOnLoginPage(){
        return isDisplayed(checkLoginLocator);
    }


}
