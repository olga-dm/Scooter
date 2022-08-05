package ru.yandex.praktikum.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;

public class HomePage {
    //Картинка-логотип самоката
    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter']")
    private SelenideElement imgLogoScooter;
    // локатор логотипа Яндекс
    @FindBy(how = How.XPATH, using = ".//img[@alt='Yandex']")
    private SelenideElement logoYandex;
    // локатора названия проекта Самокат
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement logoScooter;
    //локатор логотипа "Учебный тренажер".
    @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    private SelenideElement logoTrainingSimulator;
    //локатор App Cookie Consent
    @FindBy(how = How.XPATH, using = ".//div[@class='App_CookieConsent__1yUIN']")
    private SelenideElement appCookieConsent;
    // Текст App Cookie Consent "И здесь куки! В общем, мы их используем."
    @FindBy(how = How.XPATH, using = ".//div[text()='И здесь куки! В общем, мы их используем.']")
    private SelenideElement textCookieConsent;
    // Кнопка "да все привыкли"
    @FindBy(how = How.XPATH, using = ".//button[@class='App_CookieButton__3cvqF']")
    private SelenideElement appCookieButton;
    //Заголовок "Самокат на пару дней".
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX' and text()='Самокат ']")
    private SelenideElement headerScooterForCoupleDays;
    //Подзаголовок "Привезём его прямо к вашей двери,а когда накатаетесь — заберём.
    @FindBy(how = How.XPATH, using = ".//div[text()='Привезём его прямо к вашей двери,']")
    private SelenideElement subtitleBringTake;
    //Подзаголовок "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    @FindBy(how = How.XPATH, using = ".//div[text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
    private SelenideElement subtitleLightweight;
    //Кнопка "Заказать" в хедере страницы.
    @FindBy(how = How.XPATH, using = ".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")
    private SelenideElement buttonOrderHeader;
    //локатор элемента Статус заказа в хедере страницы
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatus;
    //локатор ввода номера заказа
    @FindBy(how = How.CLASS_NAME, using = "Header_Input__xIoUq")
    private SelenideElement headerInputOrder;
    //локатор кнопки GO
    @FindBy(how = How.CLASS_NAME, using = "Header_Button__28dPO")
    private SelenideElement buttonGo;
    //Картинка "Самокат".
    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter blueprint']")
    private SelenideElement imgScooter;
    //Таблица с параметрами самоката
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Table__2kPxP']")
    private SelenideElement tableScooterCharacteristics;
    // Модель Toxic PRO
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_Column__xlKDK'])[1]")
    private SelenideElement scooterModel;
    //Максимальная скорость
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_Column__xlKDK'])[2]")
    private SelenideElement scooterMaxSpeed;
    //40 км/ч
    @FindBy(how = How.XPATH, using = ".//div[text()='40 км/ч']")
    private SelenideElement scooterFortyKmH;
    //Проедет без подзарядки
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_Column__xlKDK'])[3]")
    private SelenideElement scooterBatteryLimit;
    //80 км
    @FindBy(how = How.XPATH, using = ".//div[text()='80 км']")
    private SelenideElement scooterBatteryLimitKm;
    //Выдерживает вес
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_Column__xlKDK'])[4]")
    private SelenideElement scooterWeightLimit;
    //120 кг
    @FindBy(how = How.XPATH, using = ".//div[text()='120 кг']")
    private SelenideElement scooterWeightLimitKg;
    //Подзаголовок "Как это работает"
    @FindBy(how = How.XPATH, using = ".//div[text()='Как это работает']")
    private SelenideElement subtitleHowItWorks;
    //Элемент "Кружок с цифрой 1 внутри"
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusCircle__3_aTp' and text()='1']")
    private SelenideElement circleOne;
    //Элемент "Кружок с цифрой 2 внутри"
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusCircle__3_aTp' and text()='2']")
    private SelenideElement circleTwo;
    // Элемент "Кружок с цифрой 3 внутри".
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusCircle__3_aTp' and text()='3']")
    private SelenideElement circleThree;
    // Элемент "Кружок с цифрой 4 внутри".
    @FindBy(how = How.XPATH, using = ".//div[contains(@class, 'Home_StatusCircle__3_aTp') and text()='4']")
    private SelenideElement circleFour;
    //Шаг 1 "Заказываете самокат"
    @FindBy(how = How.XPATH, using = ".//div[text()='Заказываете самокат']")
    private SelenideElement stepOne;
    //Описание Шага 1 "Выбираете, когда и куда привезти"
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_StatusDescription__3WGl5'])[1]")
    private SelenideElement stepOneDescription;
    //Шаг 2 "Курьер привозит самокат".
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер привозит самокат']")
    private SelenideElement stepTwo;
    //Описание Шага 2 "А вы — оплачиваете аренду"
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_StatusDescription__3WGl5'])[2]")
    private SelenideElement stepTwoDescription;
    //Шаг 3 "Катаетесь".
    @FindBy(how = How.XPATH, using = ".//div[text()='Катаетесь']")
    private SelenideElement stepThree;
    //Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_StatusDescription__3WGl5'])[3]")
    private SelenideElement stepThreeDescription;
    //Шаг 4 "Курьер забирает самокат".
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер забирает самокат']")
    private SelenideElement stepFour;
    //Описание Шага 4 "Когда аренда заканчивается".
    @FindBy(how = How.XPATH, using = "(.//div[@class='Home_StatusDescription__3WGl5'])[4]")
    private SelenideElement stepFourDescription;
    //локатор кнопки Заказать по середине
    @FindBy(how = How.CLASS_NAME, using = "Button_Middle__1CSJM")
    private SelenideElement buttonOrderMiddle;
    //локатор текста Вопросы о важном
    @FindBy(how = How.XPATH, using = ".//div[text()='Вопросы о важном']")
    private SelenideElement questions;
    //Вопрос №1 "Сколько это стоит и как оплатить"
    @FindBy(how = How.XPATH, using = ".//div[text()='Сколько это стоит? И как оплатить?']")
    private SelenideElement questionsOne;
    //Ответ на вопрос №1 "Сутки — 400 рублей. Оплата курьеру — наличными или картой.".
    @FindBy(how = How.XPATH, using = ".//div[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']")
    private SelenideElement answerOne;
    //Вопрос №2 "Хочу сразу несколько самокатов! Так можно?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Хочу сразу несколько самокатов! Так можно?']")
    private SelenideElement questionsTwo;
    //Ответ на вопрос №2. "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    @FindBy(how = How.XPATH, using = ".//div[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']")
    private SelenideElement answerTwo;
    //Вопрос №3 "Как рассчитывается время аренды?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Как рассчитывается время аренды?']")
    private SelenideElement questionsThree;
    //Ответ на вопрос №3. "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    @FindBy(how = How.XPATH, using = ".//div[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']")
    private SelenideElement answerThree;
    //Вопрос №4 "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Можно ли заказать самокат прямо на сегодня?']")
    private SelenideElement questionsFour;
    //Ответ на вопрос №4. "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    @FindBy(how = How.XPATH, using = ".//div[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']")
    private SelenideElement answerFour;
    //Вопрос №5 "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']")
    private SelenideElement questionsFive;
    //Ответ на вопрос №5. "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    @FindBy(how = How.XPATH, using = ".//div[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']")
    private SelenideElement answerFive;
    //Вопрос №6 "Вы привозите зарядку вместе с самокатом?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Вы привозите зарядку вместе с самокатом?']")
    private SelenideElement questionsSix;
    //Ответ на вопрос №6. "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.""
    @FindBy(how = How.XPATH, using = ".//div[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']")
    private SelenideElement answerSix;
    //Вопрос №7 "Можно ли отменить заказ?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Можно ли отменить заказ?']")
    private SelenideElement questionsSeven;
    //Ответ на вопрос №7. "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    @FindBy(how = How.XPATH, using = ".//div[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']")
    private SelenideElement answerSeven;
    //Вопрос №8 "Я жизу за МКАДом, привезёте?"
    @FindBy(how = How.XPATH, using = ".//div[text()='Я жизу за МКАДом, привезёте?']")
    private SelenideElement questionsEight;
    //Ответ на вопрос №8. "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    @FindBy(how = How.XPATH, using = ".//div[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']")
    private SelenideElement answerEight;
    //массив кнопок FAQ
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_FAQ__3uVm4']//div[@data-accordion-component='AccordionItemHeading']")
    private ElementsCollection buttonsFaq;
    //массив текста FAQ
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_FAQ__3uVm4']//div[@data-accordion-component='AccordionItemPanel']")
    private ElementsCollection textFaqElements;


    //метод ожидания загрузки страницы
    public void waitForLoadHomePage() {
        logoScooter.shouldBe(visible);
    }

    //метод закрытия куки

    public void clickCookieButton() {
        if (appCookieButton.exists())
            appCookieButton.click();
    }

    //метод возвращения текста из FAQ
    public String returnFaqElement(int index) {
        buttonsFaq.get(index).scrollTo().click();
        return textFaqElements.get(index).shouldBe(visible).getText();
    }


    //Нажать кнопку «Заказать». Кнопка "Заказать" в Хиддере
    public void clickButtonOrderHeader() {
        buttonOrderHeader.click();
    }

    //Нажать кнопку «Заказать». Кнопка "Заказать" в Home_Finish
    public void clickButtonOrderMiddle() {
        buttonOrderMiddle.scrollTo().click();
    }
}
