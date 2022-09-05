package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {
    //Поле "Имя"
    private By nameField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");
    //Поле "Фамилия"
    private By surnameField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Фамилия']");
    //Поле "Адрес: куда привезти заказ"
    private By addressField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']");
    //Поле "Станция метро"
    private By metroStationField = By.className("select-search__input");
    //Поле "Телефон: на него позвонит курьер"
    private By telephoneField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private By furtherButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");
    //Поле "Когда привезти самокат"
    private By whenField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Когда привезти самокат']");
    //Поле "Срок аренды"
    private By rentalPeriodField = By.cssSelector(".Dropdown-placeholder");
    //Поле "Комментария для курьера"
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка "Заказать"
    private By newOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    //Сообщение "Хотите оформить заказ?"
    private By questionNewOrder = By.cssSelector(".Order_ModalHeader__3FDaJ");
    //Кнопка "Да" в сообщении "Хотите оформить заказ?"
    private By orderYesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    //Сообщение "Заказ оформлен"
    private By newOrderText = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setUserName(String userName) {
        webDriver.findElement(nameField).sendKeys(userName);
    }

    public void setUserSurname(String userSurname) {
        webDriver.findElement(surnameField).sendKeys(userSurname);
    }

    public void setUserAddress(String userAddress) {
        webDriver.findElement(addressField).sendKeys(userAddress);
    }

    public void setMetroStation(String metroStationText) {
        webDriver.findElement(metroStationField).sendKeys(metroStationText);
        webDriver.findElement(By.xpath(".//div[@class='select-search__select']/ul/li/button/div[text()='" + metroStationText + "']")).click();
    }

    public void setUserTelephone(String userTelephone) {
        webDriver.findElement(telephoneField).sendKeys(userTelephone);
    }

    public void clickFurtherButton() {
        webDriver.findElement(furtherButton).click();
    }

    public void setWhen(String whenText) {
        webDriver.findElement(whenField).click();
        webDriver.findElement(By.xpath(".//*[@aria-label='Choose " + whenText + "']")).click();
    }

    public void setRentalPeriod(String rentalPeriodText) {
        webDriver.findElement(rentalPeriodField).click();
        webDriver.findElement(By.xpath(".//div[@class='Dropdown-menu']/div[text()='" + rentalPeriodText + "']")).click();
    }

    public void setUserComment(String userComment) {
        webDriver.findElement(commentField).sendKeys(userComment);
    }

    public void clickNewOrderButton() {
        webDriver.findElement(newOrderButton).click();
    }

    public boolean checkQuestionNewOrderIsDisplayed() {
        return webDriver.findElement(questionNewOrder).isDisplayed();
    }

    public void clickOderYesButton() {
        webDriver.findElement(orderYesButton).click();
    }

    public void order(String userName, String userSurname, String userAddress, String metroStationText, String userTelephone, String whenText, String rentalPeriodText) {
        setUserName(userName);
        setUserSurname(userSurname);
        setUserAddress(userAddress);
        setMetroStation(metroStationText);
        setUserTelephone(userTelephone);
        clickFurtherButton();
        setWhen(whenText);
        setRentalPeriod(rentalPeriodText);
        clickNewOrderButton();
        checkQuestionNewOrderIsDisplayed();
        clickOderYesButton();
    }

    public boolean checkNewOrderIsDisplayed() {
        return webDriver.findElement(newOrderText).isDisplayed();
    }
}
