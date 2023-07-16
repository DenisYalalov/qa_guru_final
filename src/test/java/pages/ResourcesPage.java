package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ResourcesPage {
    SelenideElement resourceSelection = $(".resources__tags");
    ElementsCollection size = $$(".news-item__content");

    @Step("Открываем страницу")
    public void openPage() {

        open("https://edna.io/resources/");
        open("https://edna.io/resources/");
    }

    @Step("Выбираем один из реусурсов и кликаем")
    public void resources(String value) {
        resourceSelection.shouldBe(Condition.interactable);
        resourceSelection.$(byText(value)).click();

    }

    @Step("Проверяем, что выводятся новые ресурсы")
    public void name(int value) {
        size.shouldHave(CollectionCondition.size(value));
    }
}
