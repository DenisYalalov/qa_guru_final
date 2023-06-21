package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ContactFormEdnaProgramPage {
    SelenideElement name = $("[name=name]");
    SelenideElement email = $("[name=email]");
    SelenideElement phone = $("[name=phone]");
    SelenideElement country = $("[name=country]");
    SelenideElement company = $("[name=company]");
    SelenideElement button = $("button.btn--block");


    @Step("Открываем страницу")

    public void openLinkPartners() {
        open("https://edna.ru/contacts/");

    }

    @Step("Проверяем основные элементы формы")
    public void checkMainElementsPartnersEdna() {
        name.should(Condition.visible);
        email.should(Condition.visible);
        phone.should(Condition.visible);
        country.should(Condition.visible);
        company.should(Condition.visible);
        company.scrollTo();
        button.click();


    }


}
