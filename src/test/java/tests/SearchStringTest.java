package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchString;

@Tag("final")
public class SearchStringTest {
    SearchString searchString = new SearchString();

    @Test
    void positiveTest() {
        searchString.openPage();
        searchString.positiveTest();


    }

    @Test
    void negativeTest() {
        searchString.openPage();
        searchString.negativeTest();
    }
}
