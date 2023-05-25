package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ContactFormPage {
    SelenideElement firstName = $x("//form[@name = 'Request Demo']//label[contains(text(),'First Name')]/../input");

    SelenideElement lastName = $x("//form[@name = 'Request Demo']//label[contains(text(),'Last Name')]/../input");
    SelenideElement workEmail = $x("//form[@name = 'Request Demo']//label[contains(text(),'Work Email')]/../input");
    SelenideElement phoneNumber = $x("//form[@name = 'Request Demo']//label[contains(text(),'Phone Number')]/../input");
    SelenideElement company = $x("//form[@name = 'Request Demo']//label[contains(text(),'Company')]/../input");
    SelenideElement country = $x("//form[@name = 'Request Demo']//label[contains(text(),'Country')]/..//select");
    SelenideElement anyMoreDetails = $x("//form[@name = 'Request Demo']//label[contains(text(),'Any more details would you like to share')]/../textarea");
    SelenideElement communicationsFromEdna = $x("//form[@name = 'Request Demo']//label[contains(text(),'I consent to receive communications from edna.')]/../input");
    SelenideElement button = $x("//form[@name = 'Request Demo']//button");
    SelenideElement contactSales = $("jet-switcher__control jet-switcher__control--disable.class");


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
        country.should(Condition.visible);
        anyMoreDetails.should(Condition.visible);
        communicationsFromEdna.should(Condition.visible);
        button.click();


    }

    @Step("Проверяем основные элементы формы в Contact Sales")
    public void contactSales() {
        contactSales.click();
        firstName.should(Condition.visible);
        lastName.should(Condition.visible);
        workEmail.should(Condition.visible);
        phoneNumber.should(Condition.visible);
        country.should(Condition.visible);
        anyMoreDetails.should(Condition.visible);
        communicationsFromEdna.should(Condition.visible);
        button.click();

    }

}
