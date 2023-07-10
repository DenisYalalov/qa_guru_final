package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    SelenideElement searchString = $(".kb-search__input");
    SelenideElement positiveValue = $(".mkb-entry-title");
    SelenideElement negativeResult = $(".mkb-page-title");

    @Step("Открываем страницу")
    public void openPage() {

        open("https://docs.edna.ru/");
    }

    @Step("В поисковой строке вводим {0}")
    public void searchString(String value) {
        searchString.sendKeys(value);
        searchString.pressEnter();
    }

    @Step("Проверяем результат с поиском {0}")
    public void checkResult(String value) {
        positiveValue.shouldHave(text(value));
    }

    @Step("Произвольный набор символов негативного теста")
    public void checkNegativeResult(String value) {
        negativeResult.shouldHave(text(value));
    }

}
