package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageList extends BasePage {
    //Индекс заголовка вопроса
    private By indexHeading;
    //Индекс соответствующего ответа под заголовком вопроса
    private By indexUnderHeading;

    public MainPageList(WebDriver webDriver) {
        super(webDriver);
    }

    public By getIndexOfHeading(int index) {
        indexHeading = By.xpath(".//div[@id='accordion__heading-" + index + "']");
        return indexHeading;
    }

    public void scrollToHeading() {
        WebElement element = webDriver.findElement(indexHeading);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickSwitchHeading() {
        webDriver.findElement(indexHeading).click();
    }

    public By getIndexUnderHeading(int index) {
        indexUnderHeading = By.xpath(".//div[@id='accordion__panel-" + index + "']");
        return indexUnderHeading;
    }

    public String getTextUnderHeading() {
        return webDriver.findElement(indexUnderHeading).getText();
    }

}
