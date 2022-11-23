package rozetka_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    private SelenideElement btnLaptopsAndComputers = Selenide.$x("//li[@class='menu-categories__item ng-star-inserted']//a[@class='menu-categories__link']");


    public ComputersNotebooksPage clickBtnLaptopsAndComputers(){
        btnLaptopsAndComputers.should(visible).click();
        return page(ComputersNotebooksPage.class);
    }

}
