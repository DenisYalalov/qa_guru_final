package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ContactFormPage {
    SelenideElement firstName = $("[name=name]");

    SelenideElement lastName = $("[name=l_name]");
    SelenideElement workEmail = $("[name=email]");
    SelenideElement phoneNumber = $("[name=phone]");
    SelenideElement company = $("[name=company]");
    SelenideElement country = $("[name=company]");
    SelenideElement anyMoreDetails = $("textarea[name]");
    SelenideElement communicationCheckbox = $("div.checkbox");
    SelenideElement communicationCheckbox2 = $("input[type='checkbox']");
    SelenideElement button = $("button.btn");
    SelenideElement phone = $("[name=phone]");
    SelenideElement checkbox = $("span.checkmark");
    ElementsCollection field = $$(".error-message");


    @Step("Открываем страницу контакта")

    public void openPage() {
        open("https://edna.io/contact/");

    }

    @Step("Проверяем основные элементы формы")
    public void checkMainElements() {
        firstName.should(Condition.visible);
        lastName.should(Condition.visible);
        workEmail.should(Condition.visible);
        phoneNumber.should(Condition.visible);
        company.should(Condition.visible);
        country.should(Condition.visible);
        anyMoreDetails.should(Condition.visible);
        communicationCheckbox.should(Condition.visible);
        communicationCheckbox2.should(Condition.exist);
        button.shouldBe(Condition.visible);


    }


    @Step("Проверяем основные элементы формы на обязательное заполнение полей")
    public void requiredFields() {
        firstName.should(Condition.visible);
        lastName.should(Condition.visible);
        phone.should(Condition.visible);
        company.should(Condition.visible);
        country.should(Condition.visible);
        checkbox.should(Condition.visible);
        checkbox.scrollTo();


    }


    @Step("Кликаем на кнопку")
    public void clickSendButton() {
        button.click();


    }

    @Step("При не заполнении формы выходит ошибка 'This field is required'")
    public void fillingInTheRequiredFields(int value) {
        field.shouldHave(CollectionCondition.size(value));
    }


}



