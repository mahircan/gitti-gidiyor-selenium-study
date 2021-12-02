package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By sizeButtonLocator = new By.ByCssSelector("div[class='option-size'] a[data-tracking-label='BedenSecenekleri']");
    By addButtonLocator = new By.ByCssSelector("a[class='add-to-cart button-link add-to-cart-button']");
    By basketIconLocator = new By.ByCssSelector("button[class='control-button gg-ui-button plr10 gg-ui-btn-default'] ");
    By paymentPanelLocator = new By.ByCssSelector("h4[class='payment-options-panel-title']");
    By closeDetailCookiesLocator = new By.ByCssSelector("div[class='gg-ui-button gg-ui-btn-secondary policy-alert-v2-buttons']");
    By basketButtonLocator = new By.ByCssSelector("div[class='basket-icon-title hidden-m hidden-t']");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void clickAdd(){
        click(addButtonLocator);
    }

    public void clickGoToBasket(){
        click(basketIconLocator);
    }
    public void addBasket(){
        click(basketIconLocator);
    }

    public boolean isOnCheckProductDetailPage(){
        return isDisplayed(paymentPanelLocator);
    }
    public void closeDetailCookies(){
        click(closeDetailCookiesLocator);
    }
    public void clickBasket(){
        click(basketButtonLocator);
    }




}
