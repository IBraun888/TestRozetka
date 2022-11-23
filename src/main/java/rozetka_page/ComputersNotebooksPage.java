package rozetka_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class ComputersNotebooksPage {

    private SelenideElement btnLaptop = Selenide.$x("//div[@class='tile-cats']//a[@class='tile-cats__picture']");


    public NotebooksPage clickBtnLaptop(){
        btnLaptop.should(visible).click();
        return page(NotebooksPage.class);
    }
}
