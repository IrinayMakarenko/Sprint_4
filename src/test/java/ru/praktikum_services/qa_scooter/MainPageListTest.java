package ru.praktikum_services.qa_scooter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainPageListTest extends BaseUITest {

    @Test
    public void ShouldBeOpenTextHeading0() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(0);
        String actualText0 = mainPageList.getTextUnderQuestionOfHeading(0);
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actualText0);
    }

    @Test
    public void ShouldBeOpenTextHeading1() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(1);
        String actualText1 = mainPageList.getTextUnderQuestionOfHeading(1);
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actualText1);
    }

    @Test
    public void ShouldBeOpenTextHeading2() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(2);
        String actualText2 = mainPageList.getTextUnderQuestionOfHeading(2);
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actualText2);
    }

    @Test
    public void ShouldBeOpenTextHeading3() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(3);
        String actualText3 = mainPageList.getTextUnderQuestionOfHeading(3);
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actualText3);
    }

    @Test
    public void ShouldBeOpenTextHeading4() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(4);
        String actualText4 = mainPageList.getTextUnderQuestionOfHeading(4);
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actualText4);
    }

    @Test
    public void ShouldBeOpenTextHeading5() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(5);
        String actualText5 = mainPageList.getTextUnderQuestionOfHeading(5);
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actualText5);
    }

    @Test
    public void ShouldBeOpenTextHeading6() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(6);
        String actualText6 = mainPageList.getTextUnderQuestionOfHeading(6);
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actualText6);
    }

    @Test
    public void ShouldBeOpenTextHeading7() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.clickCookieButton();
        mainPageList.clickQuestionOfHeading(7);
        String actualText7 = mainPageList.getTextUnderQuestionOfHeading(7);
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actualText7);
    }
}
