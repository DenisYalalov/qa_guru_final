package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import configs.OwnerWebConfigRunner;
import helpers.Attach;
import helpers.SelenideConfigLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        new OwnerWebConfigRunner().runWebConfig();
        SelenideConfigLogger.logSelenideMainConfigValues();

    }

    @BeforeEach
    void setUwp() {

    }

    @AfterEach
    void addAttachments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        Attach.addVideo();

    }

}
