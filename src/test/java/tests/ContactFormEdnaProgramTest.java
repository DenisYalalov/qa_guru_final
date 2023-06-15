package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactFormEdnaProgramPage;

@Tag("final")
public class ContactFormEdnaProgramTest extends TestBase {

    ContactFormEdnaProgramPage contactFormEdnaProgramPage = new ContactFormEdnaProgramPage();

    @Test
    public void openLinkPartners() {
        contactFormEdnaProgramPage.openLinkPartners();
        contactFormEdnaProgramPage.checkMainElementsPartnersEdna();


    }

}
