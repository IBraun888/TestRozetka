package rozetka_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BasketPage {

    private SelenideElement nameItem = Selenide.$x("//div[@class='cart-product__main']//a[@class='cart-product__title']");
    private SelenideElement price = Selenide.$x("//div[@class='cart-product__coast ng-star-inserted']//p[@class='cart-product__price cart-product__price--red']");

    public BasketPage checkProductNameInBasket(String expectedText) {
        Assert.assertEquals(nameItem.getText(), expectedText);
        return this;
    }

    public void writeNameItemsAndPriceOnFile() {
        String filePriceAndName = "C:\\TestRozetka\\filePriceAndName.txt";

        String getNameItems = nameItem.getText();
        String getPrices = price.getText();

        Map<String, String> listPriceAndNameItem = new HashMap<>();
        listPriceAndNameItem.put(getNameItems, getPrices);
        File file = new File(filePriceAndName);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, String> entry : listPriceAndNameItem.entrySet()) {
                bufferedWriter.write(entry.getKey() + "\n" + "Price: " + entry.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
