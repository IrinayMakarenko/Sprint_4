package ru.praktikum_services.qa_scooter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class MainPageTest extends BaseUITest {
    @Test
    public void TransitionShouldHappenToMainPageScooter() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickUpperOrderButton();
        mainPage.clickScooterLogoMainPageScooter();
        new WebDriverWait(webDriver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Home_Header__iJKdX")));
        String currentUrl = webDriver.getCurrentUrl();
        assertEquals("Не происходит переход на главную страницу Самоката", "https://qa-scooter.praktikum-services.ru/", currentUrl);
    }

    @Test
    public void TransitionShouldHappenToMainPageYandexInNewWindow() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickYandexLogoMainPageScooter();
        String winParent = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winParent.equals(winHandle))
                webDriver.switchTo().window(winHandle);
        }
        new WebDriverWait(webDriver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@aria-label='Яндекс']")));
        String currentUrl = webDriver.getCurrentUrl();
        assertEquals("Не происходит открытия главной страницы Яндекса в новом окне", "https://yandex.ru/", currentUrl);
    }
}



