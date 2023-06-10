package leftovers;

import org.junit.jupiter.api.Test;
import leftovers.ContactFormPartnershipPage;

import static com.codeborne.selenide.Selenide.open;


public class ContactFormPartnerTest {
    ContactFormPartnershipPage contactFormPartnershipPage= new ContactFormPartnershipPage();

    @Test
    public void openLink() {
        contactFormPartnershipPage.openLink();
        contactFormPartnershipPage.checkMainElements();


    }

}
