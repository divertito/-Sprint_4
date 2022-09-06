package ru.yandex.praktikum;

import org.openqa.selenium.*;

public class OrderInfo extends BaseInfo {
    //кнопка "Заказать" в хэдере
    private By orderButtonInHeader = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //кнопка "Заказать" внизу страницы
    private By orderButtonInPage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    //кнопка "Далее" в заказе
    private By nextButton = By.xpath(".//button[text()='Далее']");
    //Имя
    private By name = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    //Фамилия
    private By surname = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    //Адрес
    private By address = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    //Станция метро
    private By metroStation = By.className("select-search");
    private By metroList = By.className("select-search__options");
    //телефон
    private By phone = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    //дата доставки
    private By deliveryDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By datePicker = By.xpath(".//div[@aria-label='Choose пятница, 9-е сентября 2022 г.' and text()='9']");
    //срок аренды
    private By loanPeriod = By.xpath(".//div[@class='Dropdown-placeholder' and text() = '* Срок аренды']");
    private By period = By.xpath(".//div[@class='Dropdown-option' and text()='четверо суток']");
    //цвет самоката
    private By color = By.id("black");
    //комментарий
    private By comment = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='Комментарий для курьера']");
    //кнопка "Далее" в конце заполнения заказа
    private By orderButtonInDetails = By.xpath(".//div[@class='Order_Content__bmtHS']/div/button[text()='Заказать']");
    //кнопка "Да" (подтверждение заказа)
    private By confirmButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    //всплывающее окно с сообщением об успешном создании заказа.
    private By confirmPopup = By.className("Order_ModalHeader__3FDaJ");


    protected OrderInfo(WebDriver driver) {
        super(driver);
    }

    public void clickOrderButtonInHeader() {
        driver.findElement(orderButtonInHeader).click();
    }

    private void clickOrderButtonInPage() {
        driver.findElement(orderButtonInPage).click();
    }

    public void enterName(String firstName) {
        driver.findElement(name).sendKeys(firstName);
    }

    public void enterSurname(String secondName) {
        driver.findElement(surname).sendKeys(secondName);
    }

    public void enterAddress(String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phone).sendKeys(phoneNumber);
    }

    public void selectMetroStation() {
        driver.findElement(metroStation).click();
        driver.findElement(metroList).click();
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void enterDeliveryDate() {
        driver.findElement(deliveryDateField).click();
        driver.findElement(datePicker).click();
    }

    public void selectLoanPeriod() {
        driver.findElement(loanPeriod).click();
        driver.findElement(period).click();
    }

    public void selectColour() {
        driver.findElement(color).click();
    }

    public void enterComment(String commentText) {
        driver.findElement(comment).sendKeys(commentText);
    }

    public void clickOrder() {
        driver.findElement(orderButtonInDetails).click();
    }

    public void lastConfirm() {
        driver.findElement(confirmButton).click();
    }

    public String checkConfirmPopup() {
        String confirmPopupText = driver.findElement(confirmPopup).getText();
        return confirmPopupText;
    }

    public void scrollWindow() {
        WebElement element = driver.findElement(orderButtonInPage);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public String createOrderHeaderButton(String firstName, String secondName, String userAddress, String phoneNumber, String commentText) {
        OrderInfo orderInfo = new OrderInfo(driver);
        setCloseCookies();
        clickOrderButtonInHeader();
        enterName(firstName);
        enterSurname(secondName);
        enterAddress(userAddress);
        selectMetroStation();
        enterPhoneNumber(phoneNumber);
        clickNextButton();
        enterDeliveryDate();
        selectLoanPeriod();
        selectColour();
        enterComment(commentText);
        clickOrder();
        lastConfirm();
        String checkText = checkConfirmPopup();

        return checkText;
    }

    public String createOrderMiddleButton(String firstName, String secondName, String userAddress, String phoneNumber, String commentText) {
        OrderInfo orderInfo = new OrderInfo(driver);
        setCloseCookies();
        scrollWindow();
        clickOrderButtonInPage();
        enterName(firstName);
        enterSurname(secondName);
        enterAddress(userAddress);
        selectMetroStation();
        enterPhoneNumber(phoneNumber);
        clickNextButton();
        enterDeliveryDate();
        selectLoanPeriod();
        selectColour();
        enterComment(commentText);
        clickOrder();
        lastConfirm();
        String checkText = checkConfirmPopup();

        return checkText;
    }
}
