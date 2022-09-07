package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage extends BasePage {
    //Картинка с сообщением "Такого заказа нет"
    private By orderNotFoundText = By.className("Track_NotFound__6oaoY");

    public OrderStatusPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkOrderNotFoundIsDisplayed() {
        return webDriver.findElement(orderNotFoundText).isDisplayed();
    }
}
