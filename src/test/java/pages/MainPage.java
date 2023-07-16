package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement englishFlag = $("div.header__language_selector.desktop a[href='https://edna.io']");
    SelenideElement indonesianFlag = $("div.header__language_selector.desktop a[href='https://edna.io/id/']");
    SelenideElement heading = $("h1");

    @Step("Открываем главную страницу")
    public void openPage() {
        open("https://edna.io/");
    }

    @Step("Подводим курсор на Британский Флаг")
    public void moveCursor() {

        englishFlag.hover();
    }


    @Step("Переключаем язык на Индонезийский")
    public void switchToIndonesian() {
        indonesianFlag.shouldBe(Condition.visible);
        indonesianFlag.click();


    }

    @Step("Проверяем, что язык переключился на {0}")
    public void checkPresenceForIndonesian(String value) {
        heading.shouldHave(Condition.text(value));


    }
}
