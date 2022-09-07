package ru.praktikum_services.qa_scooter;

import org.junit.Assert;
import org.junit.Test;

public class OrderStatusPageTest extends BaseUITest {

    @Test
    public void OrderNotFoundShouldBeDisplayed() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStatusButton();
        mainPage.enterOrderNumber("123");
        mainPage.clickGoButton();
        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        boolean isDisplayed = orderStatusPage.checkOrderNotFoundIsDisplayed();
        Assert.assertTrue("Нет надписи об отсутствии заказа", isDisplayed);
    }
}
