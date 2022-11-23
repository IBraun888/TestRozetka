package test_rozetka;

import org.testng.annotations.Test;
import rozetka_page.MainPage;
import rozetka_page.NotebooksPage;

public class TestBasket extends BaseTest {

    private String nameProduct;

    private final String EXPECTED_TEXT = "Ноутбук Acer Aspire 5 A515-45G-R9ML (NX.A8CEU.00N) Pure Silver";

    @Test
    public void testBasket() {
        nameProduct = new MainPage().clickBtnLaptopsAndComputers()
                .clickBtnLaptop()
                .getProductName();
        new NotebooksPage().clickProductCardNotebook()
                .checkQntProductOnBasket("1")
                .clickBtnBasket()
                .checkProductNameInBasket(nameProduct)
                .writeNameItemsAndPriceOnFile();
    }
}
