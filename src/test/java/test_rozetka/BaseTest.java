package test_rozetka;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeMethod()
    public void openUrl() {
        Configuration.startMaximized = true;
        Configuration.timeout = 120000;
        open("https://rozetka.com.ua/");
        System.out.println("The site is open.");
    }

    @AfterMethod()
    public void turnDown() {
        closeWebDriver();
        System.out.println("The site is closed.");
    }
}
