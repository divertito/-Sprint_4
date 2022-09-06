package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.startsWith;

@RunWith(Parameterized.class)
public class OrderTest extends BaseUITest {
    private final String firstName;
    private final String secondName;
    private final String userAddress;
    private final String phoneNumber;
    private final String commentText;

    public OrderTest(String firstName, String secondName, String userAddress, String phoneNumber, String commentText) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.userAddress = userAddress;
        this.phoneNumber = phoneNumber;
        this.commentText = commentText;
    }
        // Тестовые данные
        @Parameterized.Parameters
        public static Object[][] getCredentials() {
            return new Object[][]{
                    {"Тарасова", "Марина", "Улица Сезам", "89001002233", "Привет, курьер!"},
                    {"Брюс", "Уэйн", "Готэм сити", "11001001010", "Я - бэтмэн!"},
                    {"Иванов", "Иван", "Иванович", "81234567890", "Мальчик, водочки нам принеси, мы домой летим...."},
            };
        }

        @Test
        public void shouldBeOrderCreatedUseHeaderButton() {
            OrderInfo orderInfo = new OrderInfo(driver);
            String confirmPopupText = orderInfo.createOrderHeaderButton(firstName, secondName, userAddress, phoneNumber, commentText);
            MatcherAssert.assertThat("text is correct", confirmPopupText , startsWith("Заказ оформлен"));
        }

        @Test
        public void shouldBeOrderCreatedUseButtonInPage() {
            OrderInfo orderInfo = new OrderInfo(driver);
            String confirmPopupText = orderInfo.createOrderMiddleButton(firstName, secondName, userAddress, phoneNumber, commentText);
            MatcherAssert.assertThat("text is correct", confirmPopupText , startsWith("Заказ оформлен"));
         }
    }


