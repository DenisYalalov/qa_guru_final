package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactFormPage;

@Owner("Yalalov D")
public class FillFormTest extends TestBase {
    ContactFormPage contactFormPage = new ContactFormPage();

    @Story("Основные элементы формы")
    @Test
    @Tag("final")
    @DisplayName("Проверяем основные элементы формы на обязательное заполнение полей")
    public void checkFormFields() {

        contactFormPage.openPage();
        contactFormPage.requiredFields();
    }

    @Test
    @DisplayName("Проверяем, что при не заполнении формы выходит ошибка 'This field is required'")
    void checkRequiredFieldErrorMessages() {
        contactFormPage.openPage();
        contactFormPage.clickSendButton();
        contactFormPage.fillingInTheRequiredFields(6);
    }

}
