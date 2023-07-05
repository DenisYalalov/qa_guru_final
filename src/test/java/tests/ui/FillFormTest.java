package tests.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactFormPage;

@Tag("final")
public class FillFormTest extends TestBase {
    ContactFormPage contactFormPage = new ContactFormPage();
    @Test
    public void checkFormFields() {

        contactFormPage.openPage();
        contactFormPage.requiredFields();
    }

    @Test
    void checkRequiredFieldErrorMessages() {
        contactFormPage.openPage();
        contactFormPage.clickSendButton();
        contactFormPage.fillingInTheRequiredFields(6);
    }

}
