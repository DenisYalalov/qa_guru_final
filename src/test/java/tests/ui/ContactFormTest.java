package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactFormPage;

@Owner("Yalalov D")
public class ContactFormTest extends TestBase {
    ContactFormPage contactFormPage = new ContactFormPage();

    @Story("Элементы формы")
    @Test
    @Tag("final")
    @DisplayName("Проверяем основные элементы формы")
    public void contactForm() {
        contactFormPage.openPage();
        contactFormPage.checkMainElements();


    }

}
