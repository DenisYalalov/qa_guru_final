package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ContactFormPartnershipPage {
    SelenideElement firstName = $x("//label[contains(text(),'First Name')]/../input");

    SelenideElement lastName = $x("//label[contains(text(),'Last Name')]/../input");
    SelenideElement workEmail = $x("//label[contains(text(),'Work Email')]/../input");
    SelenideElement phoneNumber = $x("//label[contains(text(),'Phone Number')]/../input");
    SelenideElement company = $x("//label[contains(text(),'Company')]/../input");
    SelenideElement country = $x("//label[contains(text(),'Country')]/..//select");
    SelenideElement anyMoreDetails = $x("//label[contains(text(),'Any more details would you like to share')]/../textarea");
    SelenideElement communicationsFromEdna = $x("//label[contains(text(),'I consent to receive communications from edna.')]/../input");
    SelenideElement button = $("button[type=submit]");


    @Step("Открываем страницу")

    public void openLink() {
        open("https://edna.io/partnership/");

    }

    @Step("Проверяем основные элементы формы Partnership")
    public void checkMainElements() {
        firstName.should(Condition.visible);
        lastName.should(Condition.visible);
        workEmail.should(Condition.visible);
        phoneNumber.should(Condition.visible);
        company.should(Condition.visible);
        country.should(Condition.visible);
        anyMoreDetails.should(Condition.visible);
        communicationsFromEdna.should(Condition.visible);
        button.click();


    }


}
