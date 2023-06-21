package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FillForm {

    SelenideElement name = $("[name=name]");
    SelenideElement lastName = $("[name=l_name]");
    SelenideElement email = $("[name=email]");
    SelenideElement phone = $("[name=phone]");
    SelenideElement company = $("[name=company]");
    SelenideElement country = $("[name=country]");
    SelenideElement checkbox = $("input[type=checkbox]");
    SelenideElement button = $("button.btn--block");
    ElementsCollection field = $$(".error-message");

    @Step("Открываем страницу")
    public void openPage() {
        open("https://edna.io/contact/");
    }

    @Step("Проверяем основные элементы формы на обаязательное заполнение")
    public void requiredFields() {
        name.should(Condition.visible);
        lastName.should(Condition.visible);
        phone.should(Condition.visible);
        company.should(Condition.visible);
        country.should(Condition.visible);
        checkbox.should(Condition.visible);
        checkbox.scrollTo();
        button.click();


    }

    @Step("При не заполнении формы выходит ошибка 'This field is required'")
    public void fillingInTheRequiredFields() {
        field.shouldHave(CollectionCondition.size(6));
    }


}
