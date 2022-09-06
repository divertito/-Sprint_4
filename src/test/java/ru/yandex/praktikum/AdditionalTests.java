package ru.yandex.praktikum;

import org.junit.Test;

public class AdditionalTests extends BaseUITest {


    @Test
    public void checkScooterLogoClick(){
        AdditionalInfo additionalInfo = new AdditionalInfo(driver);
        additionalInfo.scooterLogoClick();
    }

    @Test
    public void checkYandexPageOpens(){
        AdditionalInfo additionalInfo = new AdditionalInfo(driver);
        additionalInfo.yaLogoClick();
    }
}
