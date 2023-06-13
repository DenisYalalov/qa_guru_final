package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

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

    @Step("Проверяем, что язык переключился на Индонезийский")
    public void checkPresenceForIndonesian() {
        heading.shouldHave(Condition.text("Tingkatkan Layanan Pelanggan Anda Dengan edna’s"));


    }
}
