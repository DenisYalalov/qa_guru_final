package tests.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

@Tag("final")
public class SearchStringTest extends TestBase {

    SearchPage searchPage = new SearchPage();

    @Test
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
