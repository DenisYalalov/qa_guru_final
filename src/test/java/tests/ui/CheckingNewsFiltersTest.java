package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ResourcesPage;

@Owner("Yalalov D")
public class CheckingNewsFiltersTest extends TestBase {
    ResourcesPage resourcesPage = new ResourcesPage();

    @Story("Вывод новых ресурсов")
    @Test
    @Tag("final")
    @DisplayName("Проверяем, что вывелись выбранные ресурсы")

    public void resourceOutput() {
        resourcesPage.openPage();
        resourcesPage.resources("#Education");
        resourcesPage.name(1);

    }
}
