package tests;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.NewsOutput;

@Tag("final")
public class NewsOutputTest extends TestBase {
    NewsOutput newsOutput = new NewsOutput();

    @Test
    void displayNews() {
        newsOutput.openPage();
        newsOutput.scrollToTheButton();
        newsOutput.newsOutput();
    }

}
