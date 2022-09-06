package ru.yandex.praktikum;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class AdditionalInfo extends BaseInfo  {

    //статус заказа
    private By orderState = By.className("Header_Link__1TAG7");

    protected AdditionalInfo(WebDriver driver) {
        super(driver);
    }

    protected void clickOrderState() {
        driver.findElement(orderState).click();
    }

        public void scooterLogoClick(){
            AdditionalInfo additionalInfo = new AdditionalInfo(driver);
            setCloseCookies();
            clickOrderState();
            clickScooterLogo();
            new WebDriverWait(driver, 3)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_Header__iJKdX")));
        }

        public void yaLogoClick(){
            AdditionalInfo additionalInfo = new AdditionalInfo(driver);
            setCloseCookies();
            clickYaLogo();
            new WebDriverWait(driver, 50);
        }
}


