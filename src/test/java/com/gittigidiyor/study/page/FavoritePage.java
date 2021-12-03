package com.gittigidiyor.study.page;

import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FavoritePage extends BasePage {
    By favoriteAddCartLocator = new By.ByCssSelector("a[title='Sepete Ekle']");
    By favoriteDeleteProductsLocator = new By.ByCssSelector("span[class='checkmark']");
    By deleteButtonLocator = new By.ByCssSelector("button[type='submit']");

    public FavoritePage(WebDriver driver) {
        super(driver);
    }

    public void selectFavoriteProducts(int i){
        wait(3,favoriteAddCartLocator);
        getAllFavoriteProducts().get(i).click();
    }

    private List<WebElement> getAllFavoriteProducts(){
        return findAll(favoriteAddCartLocator);
    }

    public void deleteFavoriteProducts(int i){
        wait(3,favoriteDeleteProductsLocator);
        getAllCheckMarkProducts().get(i).click();
    }
    private List<WebElement> getAllCheckMarkProducts(){
        return findAll(favoriteDeleteProductsLocator);
    }

    public void clickFavoriteDeleteButton(){
        wait(5,deleteButtonLocator);
        click(deleteButtonLocator);
    }

}
