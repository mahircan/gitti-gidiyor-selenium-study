package com.gittigidiyor.study.test;

import com.gittigidiyor.study.base.BaseTest;
import com.gittigidiyor.study.page.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Login_Add_To_Product_Cart_Favorite_Logout extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    BuyPage buyPage;

    @Test
    @Order(1)
    public void login_and_searh_a_product() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");
        homePage = new HomePage(driver);
        homePage.hoverElement();
        Thread.sleep(2000);
        homePage.clickHoverLoginButton();
        loginPage = new LoginPage(driver);
        loginPage.loginWith("mahirsahinkaya@gmail.com","anchor07111998");
        Thread.sleep(3000);
        homePage.searchBox().search("sodom ve gomore");
        productsPage = new ProductsPage(driver);

    }
    @Test
    @Order(2)
    public void favorite_a_product() throws InterruptedException{
        Thread.sleep(2000);
        productsPage.scrollDownClick();
        Thread.sleep(2000);
        productsPage.selectProduct();
        Thread.sleep(2000);
        driver.get("https://www.gittigidiyor.com/");
        Thread.sleep(3000);
        homePage.searchBox().search("çanta");
        Thread.sleep(3000);
        productsPage.closeCookies();
        Thread.sleep(3000);
        productsPage.selectProductBag(6);
        productDetailPage = new ProductDetailPage(driver);
        Thread.sleep(3000);
        productDetailPage.closeDetailCookies();
        Thread.sleep(3000);
        productDetailPage.addBasket();
        Thread.sleep(3000);
        productDetailPage.clickBasket();
        Thread.sleep(3000);
        cartPage = new CartPage(driver);
        cartPage.plusProduct();
        Thread.sleep(3000);
        cartPage.adressButton();
        buyPage = new BuyPage(driver);
        Thread.sleep(3000);
        buyPage.saveButton();
        Thread.sleep(1000);
        buyPage.scrollDownClickBuy();
        Thread.sleep(1000);
        buyPage.clickEditBoxButton();
    }
    @Test
    @Order(3)
    public void test() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.goToHomePage();
        homePage.hoverAccountElement();
        Thread.sleep(1000);
        homePage.clickHoverFavoriteButton();
    }
}
