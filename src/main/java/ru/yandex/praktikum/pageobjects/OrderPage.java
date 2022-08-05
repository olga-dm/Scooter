package ru.yandex.praktikum.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class OrderPage {
    //текст Для кого самокат
    @FindBy(how = How.CLASS_NAME, using = "Order_Header__BZXOb")
    private SelenideElement header;
    //Ввод имени
    @FindBy(how = How.XPATH, using = ".//div/input[@placeholder='* Имя']")
    private SelenideElement inputName;
    //Ввод фамилии
    @FindBy(how = How.XPATH, using = ".//div/input[@placeholder='* Фамилия']")
    private SelenideElement inputSurname;
    //Ввод Адреса
    @FindBy(how = How.XPATH, using = ".//div/input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement inputAddress;
    //Выбор станции метро выпадающий список
    @FindBy(how = How.CLASS_NAME, using = "select-search__input")
    private SelenideElement selectSearch;
    //Ввод намера телефона
    @FindBy(how = How.XPATH, using = ".//div/input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement inputPhone;
    //Поле ввода даты привоза
    @FindBy(how = How.XPATH, using = ".//div/input[@placeholder='* Когда привезти самокат']")
    private SelenideElement inputData;
    //Поле выбора срока аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-control")
    private SelenideElement dropDownRentData;
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-menu")
    private SelenideElement dropDownRentDataMenu;
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-option")
    private ElementsCollection dropDownRentDataCase;
    //Выбор цвета самоката
    @FindBy(how = How.XPATH, using = ".//div//label//input[@id='black']")
    private SelenideElement inputBlackColorScooter;
    @FindBy(how = How.XPATH, using = ".//div//label/input[@id='grey']")
    private SelenideElement inputGreyColorScooter;
    //Поле ввода комментария
    @FindBy(how = How.XPATH, using = ".//div/input[@placeholder='Комментарий для курьера']")
    private SelenideElement inputComment;
    //Кнопка Далее
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_NextButton__1_rCA']/button")
    private SelenideElement buttonOnward;
    //кнопка Заказать
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")
    private SelenideElement buttonOrder;
    //кнопка подтверждения окончания заказа
    @FindBy(how = How.XPATH, using = ".//div/button[text()='Да']")
    private SelenideElement buttonConfirmationOrder;
    //Сообщение заказ оформлен
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_ModalHeader__3FDaJ']")
    private SelenideElement textConfirmationOrder;

    //метод ожидания загрузки страницы
    public void waitForLoadOrderPage() {
        header.shouldBe(visible);
        header.shouldHave(text("Для кого самокат"));
    }

    //Заполнение формы заказа страница Шаг1
    public void fillOrderFormStep1(String name, String surname, String address, String subway, String numberPhone) {
        inputName.setValue(name);
        inputSurname.setValue(surname);
        inputAddress.setValue(address);

        selectSearch.click();
        selectSearch.setValue(subway);
        selectSearch.sendKeys(Keys.DOWN);
        selectSearch.pressEnter();

        inputPhone.setValue(numberPhone);
    }

    //метод перехода на Шаг2
    public void goToStep2() {
        buttonOnward.scrollTo().click();
        header.shouldBe(visible);
        header.shouldHave(text("Про аренду"));
    }

    //метод заполнения Шага2
    public void fillOrderFormStep2(String time, String term, String colorScooter, String comment) {
        inputData.setValue(time).pressEnter();
        dropDownRentData.click();
        dropDownRentDataMenu.shouldBe(visible);
        dropDownRentDataCase.filterBy(text(term)).get(0).click();
        if (colorScooter.equalsIgnoreCase("чёрный жемчуг")) {
            inputBlackColorScooter.click();
        } else if (colorScooter.equalsIgnoreCase("серая безысходность")) {
            inputGreyColorScooter.click();
        }
        inputComment.setValue(comment);
    }

    //метод завершения заказа
    public String orderCompletion() {
        buttonOrder.click();
        buttonConfirmationOrder.click();
        return textConfirmationOrder.getText();
    }
}
