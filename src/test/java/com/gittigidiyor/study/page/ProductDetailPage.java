package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addButtonLocator = new By.ByCssSelector("a[class='gg-ui-btn-default padding-none']");
    By basketIconLocator = new By.ByCssSelector("button[id='add-to-basket']");
    By closeDetailCookiesLocator = new By.ByCssSelector("div[class='gg-ui-button gg-ui-btn-secondary policy-alert-v2-buttons']");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void sepeteGit(){
        click(addButtonLocator);
    }

    public void sepeteEkle(){
        click(basketIconLocator);
    }
    public void closeDetailCookies(){
        wait(3,closeDetailCookiesLocator);
        click(closeDetailCookiesLocator);
    }
}
