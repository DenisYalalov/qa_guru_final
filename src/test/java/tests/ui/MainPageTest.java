package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Owner("Yalalov D")
public class MainPageTest extends TestBase {
    MainPage mainPage = new MainPage();

    @Story("Переключение языка")
    @Test
    @Tag("final")
    @DisplayName("Проверка переключения языка на Индонезийский")
    void languageSwitchingTest() {
        mainPage.openPage();
        mainPage.moveCursor();
        mainPage.switchToIndonesian();
        mainPage.checkPresenceForIndonesian("Tingkatkan Layanan Pelanggan Anda Dengan edna’s");

    }
}
