package com.gittigidiyor.study.base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/testinium/IdeaProjects/gittigidiyor-selenium-study/src/test/resources/chromedriver.exe");


    }
    // @After
    // public void tearDown(){

    //   driver.quit();

    //  }
}
