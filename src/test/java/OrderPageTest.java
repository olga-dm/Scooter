import TestData.PropertiesData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.pageobjects.HomePage;
import ru.yandex.praktikum.pageobjects.OrderPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class OrderPageTest {
    private HomePage homePage;

    @Before
    public void init() {
        homePage = open("https://qa-scooter.praktikum-services.ru/", HomePage.class);
        homePage.waitForLoadHomePage();
        homePage.clickCookieButton();
    }

    //2) Заказ самоката. Весь флоу позитивного сценария.
    // Обрати внимание, что есть две точки входа в сценарий: кнопка «Заказать» вверху страницы и внизу.
    @Test
    public void orderFormCompletionFromHeaderButton() {
        homePage.clickButtonOrderHeader();
        OrderPage orderPage = page(OrderPage.class);
        PropertiesData propData = new PropertiesData(1);
        orderPage.fillOrderFormStep1(propData.name, propData.surname, propData.address, propData.subway, propData.numberPhone);
        orderPage.goToStep2();
        orderPage.fillOrderFormStep2(propData.time, propData.term, propData.colorScooter, propData.comment);
        String message = orderPage.orderCompletion();
        Assert.assertTrue(message.contains("Заказ оформлен"));
    }

    @Test
    public void orderFormCompletionFromMiddleButton() {
        homePage.clickButtonOrderMiddle();
        OrderPage orderPage = page(OrderPage.class);
        PropertiesData propData = new PropertiesData(2);
        orderPage.fillOrderFormStep1(propData.name, propData.surname, propData.address, propData.subway, propData.numberPhone);
        orderPage.goToStep2();
        orderPage.fillOrderFormStep2(propData.time, propData.term, propData.colorScooter, propData.comment);
        String message = orderPage.orderCompletion();
        Assert.assertTrue(message.contains("Заказ оформлен"));
    }
}
