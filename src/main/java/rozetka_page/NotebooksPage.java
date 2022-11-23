package rozetka_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class NotebooksPage {

    private SelenideElement productCardNotebook = Selenide.$x("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");
    private SelenideElement nameProductCardNotebook = Selenide.$x("//a[@class='goods-tile__heading ng-star-inserted']//span[@class='goods-tile__title']");

    public HeaderPage clickProductCardNotebook(){
        productCardNotebook.should(visible).click();
        return page(HeaderPage.class);
    }

    public String getProductName(){
        return nameProductCardNotebook.getText();
    }

}
