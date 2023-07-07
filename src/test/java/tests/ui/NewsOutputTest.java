package tests.ui;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.NewsOutput;

@Owner("Yalalov D")
public class NewsOutputTest extends TestBase {
    NewsOutput newsOutput = new NewsOutput();

    @Story("Вывод новостей")
    @Test
    @Tag("final")
    @DisplayName("Проверяем, что вывелось больше новостей")
    void displayNews() {
        newsOutput.openPage();
        newsOutput.scrollToTheButton();
        newsOutput.newsOutput();
    }

}
