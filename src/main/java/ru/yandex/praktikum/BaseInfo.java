package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BaseInfo {
    protected static WebDriver driver;
    //закрыть куки
    protected static By closeCookies = By.id("rcc-confirm-button");
    //логотип «Самоката»
    private By scooterLogo = By.className("Header_LogoScooter__3lsAR");
    //логотип Яндекса
    private By yaLogo = By.className("Header_LogoYandex__3TSOI");

    protected static void setCloseCookies() {
        driver.findElement(closeCookies).click();
    }

    protected void clickScooterLogo() {
        driver.findElement(scooterLogo).click();
    }

    protected void clickYaLogo() {
        driver.findElement(yaLogo).click();
    }

    protected BaseInfo(WebDriver driver) {
        this.driver = driver;
    }
}
