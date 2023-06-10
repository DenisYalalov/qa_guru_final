package pages;

import com.codeborne.selenide.Condition;
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
    SelenideElement button = $("button.btn--block");


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


}
