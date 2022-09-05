package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorOrderPage extends BasePage {
    //Сообщение об ошибке для поля имени
    private By nameErrorMessage = By.xpath(".//input[@placeholder='* Имя']/../div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");
    //Сообщение об ошибке для поля фамилии
    private By surnameErrorMessage = By.xpath(".//input[@placeholder='* Фамилия']/../div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");
    //Сообщение об ошибке для поля адреса
    private By adressErrorMassage = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']/../div[@class='Input_ErrorMessage__3HvIb']");
    //Сообщение об ошибке для поля станции метро
    private By metroStationErrorMessage = By.xpath(".//input[@placeholder='* Станция метро']/../../../div[@class='Order_MetroError__1BtZb']");
    //Сообщение об ошибке для поля телефона
    private By telephoneErrorMessage = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']/../div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");
    //Сообщение об ошибке для поля "Когда привезти самокат"
    private By whenError = By.xpath(".//input[@placeholder='* Когда привезти самокат']/..");
    //Сообщение об ошибке для поля срока аренды
    private By rentalPeriodError = By.xpath(".//div[@class='Dropdown-placeholder' and text()='* Срок аренды']/../..");
    //Сообщение об ошибке для поля комментария
    private By commentErrorMessage = By.xpath(".//input[@placeholder='Комментарий для курьера']/../div[@class='Input_ErrorMessage__3HvIb']");

    public ErrorOrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTextErrorName() {
        return webDriver.findElement(nameErrorMessage).getText();
    }

    public String getTextErrorSurname() {
        return webDriver.findElement(surnameErrorMessage).getText();
    }

    public String getTextErrorAdress() {
        return webDriver.findElement(adressErrorMassage).getText();
    }

    public String getTextErrorMetroStation() {
        return webDriver.findElement(metroStationErrorMessage).getText();
    }

    public String getTextErrorTelephone() {
        return webDriver.findElement(telephoneErrorMessage).getText();
    }

    public String getTextErrorWhen() {
        return webDriver.findElement(whenError).getText();
    }

    public String getTextErrorRentalPeriod() {
        return webDriver.findElement(rentalPeriodError).getText();
    }

    public String getTextErrorComment() {
        return webDriver.findElement(commentErrorMessage).getText();
    }
}
