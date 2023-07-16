package tests.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import configs.OwnerApiConfigRunner;
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
        new OwnerApiConfigRunner().runApiConfig();
        SelenideConfigLogger.logSelenideMainConfigValues();

    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();

    }

}
