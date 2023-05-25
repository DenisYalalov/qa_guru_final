package tests;

import org.junit.jupiter.api.Test;
import pages.ContactFormEdnaProgramPage;


public class ContactFormEdnaProgramTest {
    ContactFormEdnaProgramPage contactFormEdnaProgramPage = new ContactFormEdnaProgramPage();

    @Test
    public void openLinkPartners() {
        contactFormEdnaProgramPage.openLinkPartners();
        contactFormEdnaProgramPage.checkMainElementsPartnersEdna();


    }

}
