package ru.praktikum_services.qa_scooter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainPageListTest extends BaseUITest {

    @Test
    public void ShouldBeOpenTextHeading0() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(0);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(0);
        String actualText0 = mainPageList.getTextUnderHeading();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actualText0);
    }

    @Test
    public void ShouldBeOpenTextHeading1() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(1);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(1);
        String actualText1 = mainPageList.getTextUnderHeading();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actualText1);
    }

    @Test
    public void ShouldBeOpenTextHeading2() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(2);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(2);
        String actualText2 = mainPageList.getTextUnderHeading();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actualText2);
    }

    @Test
    public void ShouldBeOpenTextHeading3() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(3);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(3);
        String actualText3 = mainPageList.getTextUnderHeading();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actualText3);
    }

    @Test
    public void ShouldBeOpenTextHeading4() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(4);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(4);
        String actualText4 = mainPageList.getTextUnderHeading();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actualText4);
    }

    @Test
    public void ShouldBeOpenTextHeading5() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(5);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(5);
        String actualText5 = mainPageList.getTextUnderHeading();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actualText5);
    }

    @Test
    public void ShouldBeOpenTextHeading6() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(6);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(6);
        String actualText6 = mainPageList.getTextUnderHeading();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actualText6);
    }

    @Test
    public void ShouldBeOpenTextHeading7() {
        MainPageList mainPageList = new MainPageList(webDriver);
        mainPageList.getIndexOfHeading(7);
        mainPageList.scrollToHeading();
        mainPageList.clickSwitchHeading();
        mainPageList.getIndexUnderHeading(7);
        String actualText7 = mainPageList.getTextUnderHeading();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actualText7);
    }
}
