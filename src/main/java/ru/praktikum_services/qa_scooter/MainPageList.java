package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageList extends BasePage {
    //Кнопка для куки "Да все привыкли"
    private By cookieButton = By.id("rcc-confirm-button");

    public MainPageList(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }

    public void clickQuestionOfHeading(int index) {
        WebElement element = webDriver.findElement(By.xpath(".//div[@id='accordion__heading-" + index + "']"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        element = webDriver.findElement(By.xpath(".//div[@id='accordion__heading-" + index + "']"));
        element.click();
    }

    public String getTextUnderQuestionOfHeading(int index) {
        new WebDriverWait(webDriver, 5).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-" + index + "']")));
        return webDriver.findElement(By.xpath(".//div[@id='accordion__panel-" + index + "']")).getText();
    }

}
