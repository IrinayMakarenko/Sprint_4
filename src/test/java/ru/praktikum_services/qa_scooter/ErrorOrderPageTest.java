package ru.praktikum_services.qa_scooter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ErrorOrderPageTest extends BaseUITest {
    @Test
    public void ErrorNameMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickFurtherButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextName = errorOrderPage.getTextErrorName();
        assertEquals("Отсутствует текст об ошибке в поле имени", "Введите корректное имя", actualErrorTextName);
    }

    @Test
    public void ErrorSurnameMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickFurtherButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextSurname = errorOrderPage.getTextErrorSurname();
        assertEquals("Отсутствует текст об ошибке в поле фамилии", "Введите корректную фамилию", actualErrorTextSurname);
    }

    @Test
    public void ErrorAdressMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickFurtherButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextAdress = errorOrderPage.getTextErrorAdress();
        assertEquals("Отсутствует текст об ошибке в поле адреса", "Введите корректный адрес", actualErrorTextAdress);
    }

    @Test
    public void ErrorMetroStationMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickFurtherButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextMetroStation = errorOrderPage.getTextErrorMetroStation();
        assertEquals("Отсутствует текст об ошибке в поле станции", "Выберите станцию", actualErrorTextMetroStation);
    }

    @Test
    public void ErrorTelephoneMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.clickFurtherButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextTelephone = errorOrderPage.getTextErrorTelephone();
        assertEquals("Отсутствует текст об ошибке в поле телефона", "Введите корректный номер", actualErrorTextTelephone);
    }

    @Test
    public void ErrorWhenMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.setUserName("Марина");
        orderPage.setUserSurname("Иванова");
        orderPage.setUserAddress("Фрунзенская, 18");
        orderPage.setMetroStation("Сокол");
        orderPage.setUserTelephone("89076731144");
        orderPage.clickFurtherButton();
        orderPage.clickNewOrderButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextWhen = errorOrderPage.getTextErrorWhen();
        assertEquals("Отсутствует текст об ошибке в поле даты", "Выберите дату", actualErrorTextWhen);
    }

    @Test
    public void ErrorRentalPeriodMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.setUserName("Марина");
        orderPage.setUserSurname("Иванова");
        orderPage.setUserAddress("Фрунзенская, 18");
        orderPage.setMetroStation("Сокол");
        orderPage.setUserTelephone("89076731144");
        orderPage.clickFurtherButton();
        orderPage.clickNewOrderButton();
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextRentalPeriod = errorOrderPage.getTextErrorRentalPeriod();
        assertEquals("Отсутствует текст об ошибке в поле срока аренды", "Выберите срок аренды", actualErrorTextRentalPeriod);
    }

    @Test
    public void ErrorCommentMessageIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.setUserName("Марина");
        orderPage.setUserSurname("Иванова");
        orderPage.setUserAddress("Фрунзенская, 18");
        orderPage.setMetroStation("Сокол");
        orderPage.setUserTelephone("89076731144");
        orderPage.clickFurtherButton();
        orderPage.setUserComment("Give me your money");
        ErrorOrderPage errorOrderPage = new ErrorOrderPage(webDriver);
        String actualErrorTextComment = errorOrderPage.getTextErrorComment();
        assertEquals("Отсутствует текст об ошибке в поле комментария", "Тут что-то не так", actualErrorTextComment);
    }
}
