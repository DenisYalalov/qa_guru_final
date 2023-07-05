package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("final")
public class ResourcesPage {
    SelenideElement resourceSelection = $(".resources__tags");
    ElementsCollection size = $$(".news-item__content");

    @Step("Открываем страницу")
    public void openPage() {
        open("https://edna.io/resources/#articles");
    }

    @Step("Выбираем один из реусурсов и кликаем")
    public void resources(String value) {
        resourceSelection.$(byText(value)).click();


    }

    @Step("Проверяем, что выводятся новые ресурсы")
    public void name(int value) {
        size.shouldHave(CollectionCondition.size(value));
    }
}
