package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactFormEdnaProgramPage;

@Owner("Yalalov D")
public class ContactFormEdnaProgramTest extends TestBase {

    ContactFormEdnaProgramPage contactFormEdnaProgramPage = new ContactFormEdnaProgramPage();

    @Story("Элеметы фомы")
    @Test
    @Tag("final")
    @DisplayName("Проверка основных элементов формы")
    public void openLinkPartners() {
        contactFormEdnaProgramPage.openLinkPartners();
        contactFormEdnaProgramPage.checkMainElementsPartnersEdna();


    }

}
