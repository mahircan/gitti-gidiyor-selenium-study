package com.gittigidiyor.study.page;
import com.gittigidiyor.study.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductsPage extends BasePage {
    By seeMoreButtonLocator = new By.ByCssSelector("a[class='lazy-load-button']");
    By productsPicturesLocator = new By.ByCssSelector("div[data-cy='product-favorite']");
    By productsFilterLocator =  new By.ByCssSelector("div[data-cy='product-favorite']");
    By bagPicturesLocator = new By.ByCssSelector("li[class='sc-1nx8ums-0 dyekHG']");
    By closeCookiesLocator = new By.ByCssSelector("a[class='tyj39b-5 bEEsJG']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void scrollDownClick() throws InterruptedException {
        Thread.sleep(3000);
        scrollDown().executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public boolean isOnProductsPage(){
        return isDisplayed(productsFilterLocator);
    }

    public void selectProduct(){
        wait(3,productsPicturesLocator);
        clickElementsRandom(productsPicturesLocator);
    }

    private List<WebElement> getAllProducts(){
        return findAll(productsPicturesLocator);
    }

    public void selectProductBag(int i){
        waitList(3,bagPicturesLocator);
        getAllBags().get(i).click();
    }
    private List<WebElement> getAllBags(){
        return findAll(bagPicturesLocator);
    }

    public void closeCookies(){
        click(closeCookiesLocator);
    }

}
