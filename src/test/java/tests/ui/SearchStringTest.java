package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

@Owner("Yalalov D")
public class SearchStringTest extends TestBase {
    SearchPage searchPage = new SearchPage();

    @Story("Поисковая строка")
    @Test
    @Tag("final")
    @DisplayName("Проверяем результаты с поиском")
    void positiveTest() {
        searchPage.openPage();
        searchPage.searchString("edna Pulse");
        searchPage.checkResult("Начало работы в edna Pulse");
    }

    @Test
    void negativeTest() {
        searchPage.openPage();
        searchPage.searchString("asdgewda");
        searchPage.checkNegativeResult("Результатов не найдено");

    }
}
