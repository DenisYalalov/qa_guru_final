package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchString {
    SelenideElement positive = $(".kb-search__input");
    SelenideElement positiveValue = $("#mkb-article-10523");
    SelenideElement negative = $(".kb-search__input");
    SelenideElement negativeValue = $(".mkb-page-title");

    @Step("Открываем страницу")
    public void openPage() {

        open("https://docs.edna.ru/");
    }

    @Step("Положительный тест на поисковую строку")
    public void positiveTest() {
        positive.sendKeys("edna Pulse");
        positive.pressEnter();
        positiveValue.shouldHave(text("Начало работы в edna Pulse"));
    }

    @Step("Произвольный набор символов, на проверку негативного теста")
    public void negativeTest() {
        negative.sendKeys("dsedadw");
        negative.pressEnter();
        negativeValue.shouldHave(text("Результатов  не  найдено"));
    }
}
