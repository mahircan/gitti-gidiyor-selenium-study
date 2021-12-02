package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By firstProductValueLocator = new By.ByCssSelector("select[data-maxamount='3']");
    By plusProductLocator = new By.ByCssSelector("select[data-maxamount='3'] option[value='2']");
    By adressButtonLocator = new By.ByCssSelector("input[type='submit']");
    By clickHomePageLocator = new By.ByCssSelector("input[type='submit']");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void plusProduct() throws InterruptedException {
        click(firstProductValueLocator);
        Thread.sleep(3000);
        click(plusProductLocator);
    }
    public void adressButton(){
        click(adressButtonLocator);
    }

    public void goToHomePage(){
        click(clickHomePageLocator);
    }

 //   public boolean checkIfTwoProductAdd(){
  //      return isDisplayed(productValueLocator);
  //  }
  //  public void deleteProduct() throws InterruptedException {
    //    click(deleteIconLocator);
 //  Thread.sleep(3000);
    //     click(verifiedDeleteButton);
    // }
}
