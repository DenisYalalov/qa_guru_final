package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class NewsOutput {
    SelenideElement buttonShowMore = $("#true_loadmore");
    ElementsCollection size = $$("article.news-item");

    @Step("Открываем страницу с новостями")
    public void openPage() {

        open("https://edna.ru/news/");

    }

    @Step("Пролистывем до конпки 'Показать Больше' и кликаем")
    public void scrollToTheButton() {
        buttonShowMore.scrollTo();
        buttonShowMore.click();


    }

    @Step("Проверяем что вывелось больше новостей")

    public void newsOutput() {
        size.shouldHave(CollectionCondition.size(12));
    }
}
