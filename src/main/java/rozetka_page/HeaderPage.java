package rozetka_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;
import static java.time.Duration.ofSeconds;

public class HeaderPage {

    private SelenideElement btnBasket = Selenide.$x("//button[@class='header__button ng-star-inserted header__button--active']");
    private SelenideElement itemInBasket = Selenide.$x("//span[@class='counter counter--green ng-star-inserted']");

    public BasketPage clickBtnBasket() {
        btnBasket.should(visible, ofSeconds(10)).click();
        return page(BasketPage.class);
    }

    public HeaderPage checkQntProductOnBasket(String qntProduct) {
        String getTextBasket = itemInBasket.getText();
        Assert.assertEquals(getTextBasket, qntProduct);
        return this;
    }

}
