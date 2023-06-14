package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("final")
public class MainPageTest {
    MainPage mainPage = new MainPage();

    @Test
    void languageSwitchingTest() {
        mainPage.openPage();
        mainPage.moveCursor();
        mainPage.switchToIndonesian();
        mainPage.checkPresenceForIndonesian();

    }
}
