package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By firstProductValueLocator = new By.ByCssSelector("option[value='1']");
    By plusProductLocator = new By.ByCssSelector("option[value='2']");
    By adressButtonLocator = new By.ByCssSelector("input[type='submit']");
    By clickHomePageLocator = new By.ByCssSelector("a[class='logo_gg imglink logo-small']");
    By plussLocator = new By.ByCssSelector("select[class='amount']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void plusProduct() {
        wait(3,firstProductValueLocator);
        click(firstProductValueLocator);
        wait(3,plusProductLocator);
        click(plusProductLocator);
    }
    public void adressButton(){
        wait(3,adressButtonLocator);
        click(adressButtonLocator);
    }

    public void goToHomePage(){
        wait(5,clickHomePageLocator);
        click(clickHomePageLocator);
    }

}
