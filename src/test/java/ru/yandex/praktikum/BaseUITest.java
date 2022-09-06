package ru.yandex.praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseUITest {

    protected WebDriver driver;

    @Before
    public void setup() {
        //Mozilla Firefox
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();

        //Google Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        //открыть страницу
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //раскрыть окно на весь экран
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}