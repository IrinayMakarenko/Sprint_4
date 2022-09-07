package ru.praktikum_services.qa_scooter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class OrderPageTest extends BaseUITest {
    private final String userName;
    private final String userSurname;
    private final String userAddress;
    private final String metroStationText;
    private final String userTelephone;
    private final String whenText;
    private final String rentalPeriodText;

    public OrderPageTest(String userName, String userSurname, String userAddress, String metroStationText, String userTelephone, String whenText, String rentalPeriodText) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
        this.metroStationText = metroStationText;
        this.userTelephone = userTelephone;
        this.whenText = whenText;
        this.rentalPeriodText = rentalPeriodText;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][]{
                {"Аграфена", "Иванова", "Фрунзенская набережная 46", "Черкизовская", "+79076731144", "среда, 7-е сентября 2022 г.", "сутки"},
                {"Петя", "Соловьёв", "Антонова-Овсеенко, 18", "Сокол", "89076731144", "четверг, 8-е сентября 2022 г.", "двое суток"},
                {"Ян", "МарКлэ", "М.Пироговская, 16", "Митино", "+8617324333", "пятница, 9-е сентября 2022 г.", "трое суток"},
        };
    }

    @Test
    public void NewOrderUpperButtonIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.order(userName, userSurname, userAddress, metroStationText, userTelephone, whenText, rentalPeriodText);
        boolean isDisplayed = orderPage.checkNewOrderIsDisplayed();
        Assert.assertTrue("Нет сообщения об успешном создании заказа", isDisplayed);
    }

    @Test
    public void NewOrderLowerButtonIsDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToLowerOrderButton();
        mainPage.clickLowerOrderButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.order(userName, userSurname, userAddress, metroStationText, userTelephone, whenText, rentalPeriodText);
        boolean isDisplayed = orderPage.checkNewOrderIsDisplayed();
        Assert.assertTrue("Нет сообщения об успешном создании заказа", isDisplayed);
    }
}
