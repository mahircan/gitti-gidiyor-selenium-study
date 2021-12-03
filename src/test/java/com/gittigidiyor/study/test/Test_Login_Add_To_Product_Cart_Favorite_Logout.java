package com.gittigidiyor.study.test;
import com.gittigidiyor.study.base.BaseTest;
import com.gittigidiyor.study.page.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Login_Add_To_Product_Cart_Favorite_Logout extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    BuyPage buyPage;
    FavoritePage favoritePage;
    TabPage tabPage;

    @Test
   // @Disabled("We have bugs in this test section")
    @Order(1)
    public void login_and_searh_a_product() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.hoverElement();
        Thread.sleep(2000);
        homePage.clickHoverLoginButton();
        loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.isOnLoginPage(),
                "Not on Login Page!");
        loginPage.loginWith("mahirsahinkaya@gmail.com","anchor07111998");
        Assertions.assertTrue(homePage.isHomePage(),
                "Not on Home Page!");
        homePage.searchBox().search("sodom ve gomore");
        productsPage = new ProductsPage(driver);
    }
    @Test
    @Disabled("We call only for negative tests")
    @Order(2)
        public void negative_login_and_search_a_product() throws InterruptedException {
            homePage = new HomePage(driver);
            homePage.hoverElement();
            Thread.sleep(2000);
            homePage.clickHoverLoginButton();
            loginPage = new LoginPage(driver);
            Assertions.assertTrue(loginPage.isOnLoginPage(),
                    "Not on Login Page!");
            loginPage.loginWith("","");
            Assertions.assertTrue(homePage.isHomePage(),
                    "Not on Home Page!");
            homePage.searchBox().search("");
            productsPage = new ProductsPage(driver);
        }

    @Test
   // @Disabled("We have bugs in this test section")
    @Order(3)
    public void select_favorite_products_and_go_to_product() throws InterruptedException{
        productsPage.scrollDownClick();
        productsPage.selectProduct();
        driver.get("https://www.gittigidiyor.com/");
        homePage.searchBox().search("çanta");
        productsPage.closeCookies();
        productsPage.selectProductBag(6);
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.closeDetailCookies();
        Thread.sleep(2000);
        productDetailPage.sepeteEkle();
        Thread.sleep(2000);
        productDetailPage.sepeteGit();
    }
    @Test
    //@Disabled("We have bugs in this test section")
    @Order(4)
    public void add_cart_product_and_add_adress() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.plusProduct();
        cartPage.adressButton();
        buyPage = new BuyPage(driver);
        buyPage.saveButton();
        buyPage.scrollDownClickBuy();
        buyPage.clickEditBoxButton();
    }
    @Test
    //@Disabled("We have bugs in this test section")
    @Order(5)
    public void go_to_favorite_page_add_and_delete() throws InterruptedException {
        cartPage.goToHomePage();
        homePage.hoverAccountElement();
        homePage.clickHoverFavoriteButton();
        favoritePage = new FavoritePage(driver);
        favoritePage.selectFavoriteProducts(1);
        Thread.sleep(1000);
        favoritePage.deleteFavoriteProducts(3);
        Thread.sleep(2000);
        favoritePage.clickFavoriteDeleteButton();
        Thread.sleep(2000);
        tabPage = new TabPage(driver);
        tabPage.newTabHomePage();
        homePage.hoverAccountElement();
        homePage.clickHoverLogoutButton();
        driver.close();
    }
}
