package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class FAQTest extends BaseUITest {

    @Test
    public void checkTextInFirstSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openFirstQuestion();
        String price = faqInfo.checkFirstAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", price, equalTo("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    @Test
    public void checkTextInSecondSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openSecondQuestion();
        String multScooter = faqInfo.checkSecondAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", multScooter, equalTo("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    @Test
    public void checkTextInThirdSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openThirdQuestion();
        String rentPeriod = faqInfo.checkThirdAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", rentPeriod, equalTo("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    @Test
    public void checkTextInFourthSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openFourthQuestion();
        String todayRent = faqInfo.checkFourthAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", todayRent, equalTo("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    @Test
    public void checkTextInFifthSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openFifthQuestion();
        String returnDate = faqInfo.checkFifthAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", returnDate, equalTo("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    @Test
    public void checkTextInSixthSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openSixthQuestion();
        String charge = faqInfo.checkSixthAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", charge, equalTo("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    @Test
    public void checkTextInSeventhSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openSeventhQuestion();
        String decline = faqInfo.checkSeventhAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", decline, equalTo("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    @Test
    public void checkTextInEightSection() {
        FAQInfo faqInfo = new FAQInfo(driver);
        faqInfo.setCloseCookies();
        faqInfo.scrollWindow();
        faqInfo.openEightQuestion();
        String mcad = faqInfo.checkEightAnswer();
        MatcherAssert.assertThat("Text is incorrect or not found.", mcad, equalTo("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}
