package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyPage extends BasePage {
    By saveButtonLocator = new By.ByCssSelector("button[value='Kaydet']");
    By editButtonLocator = new By.ByCssSelector("a[title='Sepeti Düzenle']");
    public BuyPage(WebDriver driver) {
        super(driver);
    }

    public void saveButton(){
        wait(5,saveButtonLocator);
        click(saveButtonLocator);
    }

   // public boolean checkErrorMessage(){}

    public void scrollDownClickBuy() throws InterruptedException {
            Thread.sleep(3000);
            scrollDown().executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public void clickEditBoxButton(){
        wait(5,editButtonLocator);
        click(editButtonLocator);
    }
}
