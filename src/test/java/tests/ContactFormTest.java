package tests;

import org.junit.jupiter.api.Test;
import pages.ContactFormPage;


public class ContactFormTest {
    ContactFormPage contactFormPage = new ContactFormPage();

    @Test
    public void contactForm() {
        contactFormPage.openPage();
        contactFormPage.checkMainElements();


    }

}
