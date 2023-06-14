package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactFormPage;

@Tag("final")
public class ContactFormTest {
    ContactFormPage contactFormPage = new ContactFormPage();

    @Test
    public void contactForm() {
        contactFormPage.openPage();
        contactFormPage.checkMainElements();


    }

}
