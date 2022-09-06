package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FAQTest extends BaseUITest {
    
    @Test
    public void checkTextInFirstSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openFirstQuestion();
        String price = faqInfo.checkFirstAnswer();
        assertEquals("text is correct", price , "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }
    @Test
    public void checkTextInSecondSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openSecondQuestion();
        String multScooter = faqInfo.checkSecondAnswer();
        assertEquals("text is correct", multScooter , "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }
    @Test
    public void checkTextInThirdSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openThirdQuestion();
        String rentPeriod = faqInfo.checkThirdAnswer();
        assertEquals("text is correct", rentPeriod , "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }
    @Test
    public void checkTextInFourthSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openFourthQuestion();
        String todayRent = faqInfo.checkFourthAnswer();
        assertEquals("text is correct", todayRent , "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }
    @Test
    public void checkTextInFifthSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openFifthQuestion();
        String todayRent = faqInfo.checkFifthAnswer();
        assertEquals("text is correct", todayRent , "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }
    @Test
    public void checkTextInSixthSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openSixthQuestion();
        String todayRent = faqInfo.checkSixthAnswer();
        assertEquals("text is correct", todayRent , "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }
    @Test
    public void checkTextInSeventhSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openSeventhQuestion();
        String todayRent = faqInfo.checkSeventhAnswer();
        assertEquals("text is correct", todayRent , "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }
    @Test
    public void checkTextInEightSection(){
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.scrollWindow();
        faqInfo.openEightQuestion();
        String todayRent = faqInfo.checkEightAnswer();
        assertEquals("text is correct", todayRent , "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
}
