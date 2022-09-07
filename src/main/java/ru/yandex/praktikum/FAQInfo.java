package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FAQInfo extends BaseInfo {
    //Вопросы о важном
    private By faqSection = By.xpath(".//div[@class='Home_SubHeader__zwi_E' and text()='Вопросы о важном']");
    //первый вопрос
    private By accFirstQuestion = By.id("accordion__heading-0");
    //первый ответ
    private By accFirstAnswer = By.id("accordion__panel-0");
    //второй вопрос
    private By accSecondQuestion = By.id("accordion__heading-1");
    // второй ответ
    private By accSecondAnswer = By.id("accordion__panel-1");
    //третий вопрос
    private By accThirdQuestion = By.id("accordion__heading-2");
    //третий ответ
    private By accThirdAnswer = By.id("accordion__panel-2");
    //четвертый вопрос
    private By accFourthQuestion = By.id("accordion__heading-3");
    //четвертый ответ
    private By getAccFourthAnswer = By.id("accordion__panel-3");
    //пятый вопрос
    private By accFifthQuestion = By.id("accordion__heading-4");
    //пятый ответ
    private By getAccFifthAnswer = By.id("accordion__panel-4");
    //шестой вопрос
    private By accSixthQuestion = By.id("accordion__heading-5");
    //шестой ответ
    private By getAccSixthAnswer = By.id("accordion__panel-5");
    //седьмой вопрос
    private By accSeventhQuestion = By.id("accordion__heading-6");
    //седьмой ответ
    private By getAccSeventhAnswer = By.id("accordion__panel-6");
    //восьмой вопрос
    private By accEightQuestion = By.id("accordion__heading-7");
    //восьмой ответ
    private By getAccEightAnswer = By.id("accordion__panel-7");

    protected FAQInfo(WebDriver driver) {
        super(driver);
    }

    protected void openFirstQuestion() {
        driver.findElement(accFirstQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(accFirstAnswer));
    }

    protected String checkFirstAnswer() {
        String price = driver.findElement(accFirstAnswer).getText();
        return price;
    }

    protected void openSecondQuestion() {
        driver.findElement(accSecondQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(accSecondAnswer));
    }

    protected String checkSecondAnswer() {
        String multScooters = driver.findElement(accSecondAnswer).getText();
        return multScooters;
    }

    protected void openThirdQuestion() {
        driver.findElement(accThirdQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(accThirdAnswer));
    }

    protected String checkThirdAnswer() {
        String rentPeriod = driver.findElement(accThirdAnswer).getText();
        return rentPeriod;
    }

    protected void openFourthQuestion() {
        driver.findElement(accFourthQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(getAccFourthAnswer));
    }

    protected String checkFourthAnswer() {
        String todayRent = driver.findElement(getAccFourthAnswer).getText();
        return todayRent;
    }

    protected void openFifthQuestion() {
        driver.findElement(accFifthQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(getAccFifthAnswer));
    }

    protected String checkFifthAnswer() {
        String returnDate = driver.findElement(getAccFifthAnswer).getText();
        return returnDate;
    }

    protected void openSixthQuestion() {
        driver.findElement(accSixthQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(getAccSixthAnswer));
    }

    protected String checkSixthAnswer() {
        String charge = driver.findElement(getAccSixthAnswer).getText();
        return charge;
    }

    protected void openSeventhQuestion() {
        driver.findElement(accSeventhQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(getAccSeventhAnswer));
    }

    protected String checkSeventhAnswer() {
        String decline = driver.findElement(getAccSeventhAnswer).getText();
        return decline;
    }

    protected void openEightQuestion() {
        driver.findElement(accEightQuestion).click();
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(getAccEightAnswer));
    }

    protected String checkEightAnswer() {
        String mcad = driver.findElement(getAccEightAnswer).getText();
        return mcad;
    }

    public void scrollWindow() {
        WebElement element = driver.findElement(faqSection);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
