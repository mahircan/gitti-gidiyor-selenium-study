package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    SearchBox searchBox;

    By uniqueHomePageLocator = new By.ByCssSelector("button[class='style__StyledTab-v9cpf6-1 xWmCe']");
    By hoverLoginButtonLocator = new By.ByCssSelector("div[data-cy='header-user-menu']");
    By hoverLoginClickLocator = new By.ByCssSelector("a[data-cy='header-login-button']");
    By hoverAccountButtonLocator = new By.ByCssSelector("div[title='Hesabım'] div[class='gekhq4-4 egoSnI']");
    By hoverFavoriteButtonLocator = new By.ByCssSelector("a[title='Favorilerim']");
    By hoverLogoutButtonLocator = new By.ByCssSelector("a[title='Çıkış']");
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
        wait(3,hoverLoginClickLocator);
        click(hoverLoginClickLocator);
    }

    public void hoverAccountElement(){
        hoverElement(hoverAccountButtonLocator);
    }
    public void clickHoverFavoriteButton(){
        wait(3,hoverFavoriteButtonLocator);
        click(hoverFavoriteButtonLocator);
    }

    public void clickHoverLogoutButton(){
        wait(3,hoverLogoutButtonLocator);
        click(hoverLogoutButtonLocator);
    }


       public boolean isHomePage() {
      return isDisplayed(uniqueHomePageLocator);
     }
}
