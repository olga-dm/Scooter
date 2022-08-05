import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTest {

    private HomePage homePage;

    @Before
    public void init() {
        HomePage homePage = open("https://qa-scooter.praktikum-services.ru/", HomePage.class);
        homePage.waitForLoadHomePage();
        this.homePage = homePage;
    }

    // 1) Выпадающий список в разделе «Вопросы о важном». Тебе нужно проверить: когда нажимаешь на стрелочку, открывается соответствующий текст.
    // Важно написать отдельный тест на каждый вопрос.
    @Test
    public void faq1Test() {
        String text = homePage.returnFaqElement(0);
        Assert.assertEquals(text, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }

    @Test
    public void faq2Test() {
        String text = homePage.returnFaqElement(1);
        Assert.assertEquals(text, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }

    @Test
    public void faq3Test() {
        String text = homePage.returnFaqElement(2);
        Assert.assertEquals(text, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }

    @Test
    public void faq4Test() {
        String text = homePage.returnFaqElement(3);
        Assert.assertEquals(text, "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }

    @Test
    public void faq5Test() {
        String text = homePage.returnFaqElement(4);
        Assert.assertEquals(text, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }

    @Test
    public void faq6Test() {
        String text = homePage.returnFaqElement(5);
        Assert.assertEquals(text, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }

    @Test
    public void faq7Test() {
        String text = homePage.returnFaqElement(6);
        Assert.assertEquals(text, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }

    @Test
    public void faq8Test() {
        String text = homePage.returnFaqElement(7);
        Assert.assertEquals(text, "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
}


