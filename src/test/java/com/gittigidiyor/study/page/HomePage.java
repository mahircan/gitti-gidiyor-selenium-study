package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    SearchBox searchBox;

    By uniqueHomePageLocator = new By.ByCssSelector("button[class='style__StyledTab-v9cpf6-1 xWmCe']");
    By hoverLoginButtonLocator = new By.ByCssSelector("div[data-cy=\"header-user-menu\"]");
    By hoverLoginClickLocator = By.xpath("//a[@data-cy='header-login-button']");
    By hoverAccountButtonLocator = new By.ByCssSelector("");
    By hoverFavoriteButtonLocator = new By.ByCssSelector("");
    //By hover yapan için
    //tıklattıçağımız olacak


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public void hoverElement(){
        hoverElement(hoverLoginButtonLocator);
    }
    public void clickHoverLoginButton(){

        click(hoverLoginClickLocator);
    }

    public void hoverAccountElement(){
        hoverElement(hoverAccountButtonLocator);
    }
    public void clickHoverFavoriteButton(){

        click(hoverFavoriteButtonLocator);
    }




    //   public boolean isHomePage() {
    //  return isDisplayed(uniqueHomePageLocator);
    // }
}
