package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ContactFormEdnaProgramPage {
    SelenideElement onClick = $x("//a[contains(text(),'OK')]");
    SelenideElement name = $x("div.block-banner__content input[name=name]");

    SelenideElement email = $x("div.block-banner__content input[type=Email]");
    SelenideElement phone = $x("div.block-banner__content input[name=phone]");
    SelenideElement country = $x("div.block-banner__content select[name=country]");
    SelenideElement company = $x("div.block-banner__content input[name=company]");
    SelenideElement checkbox = $x("div.block-banner__content input[type=checkbox]");
    SelenideElement button = $x("div.block-banner__content button");


    @Step("Открываем страницу")

    public void openLinkPartners() {
        open("https://edna.ru/partners/");

    }

    @Step("Заполнение формы PartnersEdna")
    public void checkMainElementsPartnersEdna() {
        onClick.submit();
        name.should(Condition.visible);
        email.should(Condition.visible);
        phone.should(Condition.visible);
        country.should(Condition.visible);
        company.should(Condition.visible);
        checkbox.should(Condition.visible);
        button.click();


    }


}
