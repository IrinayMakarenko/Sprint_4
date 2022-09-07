package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    //Кнопка "Статус заказа"
    private By orderStatusButton = By.cssSelector(".Header_Link__1TAG7");
    //Поле "Введите номер заказа"
    private By orderNumberField = By.cssSelector(".Input_Input__1iN_Z.Header_Input__xIoUq");
    //Кнопка "Go!"
    private By goButton = By.cssSelector(".Button_Button__ra12g.Header_Button__28dPO");
    //Кнопка "Заказать" вверху главной страницы
    private By upperOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    //Кнопка "Заказать" внизу главной страницы
    private By lowerOrderButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");
    //Логотип "Яндекс" на главной странице Самоката
    private By yandexLogoMainPageScooter = By.xpath(".//img[@alt='Yandex']");
    //Логотип "Самокат" на главной странице Самоката
    private By scooterLogoMainPageScooter = By.xpath(".//img[@alt='Scooter']");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOrderStatusButton() {
        webDriver.findElement(orderStatusButton).click();
    }

    public void enterOrderNumber(String text) {
        webDriver.findElement(orderNumberField).sendKeys(text);
    }

    public void clickGoButton() {
        new WebDriverWait(webDriver, 5).until(ExpectedConditions.elementToBeClickable(goButton));
        webDriver.findElement(goButton).click();
    }

    public void clickUpperOrderButton() {
        webDriver.findElement(upperOrderButton).click();
    }

    public void scrollToLowerOrderButton() {
        WebElement element = webDriver.findElement(lowerOrderButton);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickLowerOrderButton() {
        webDriver.findElement(lowerOrderButton).click();
    }

    public void clickScooterLogoMainPageScooter() {
        webDriver.findElement(scooterLogoMainPageScooter).click();
    }

    public void clickYandexLogoMainPageScooter() {
        webDriver.findElement(yandexLogoMainPageScooter).click();
    }
}
