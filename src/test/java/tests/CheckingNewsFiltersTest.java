package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CheckingNewsFilters;

@Tag("final")
public class CheckingNewsFiltersTest extends TestBase {
    CheckingNewsFilters checkingNewsFilters = new CheckingNewsFilters();

    @Test

    public void resourceOutput() {
        checkingNewsFilters.openPage();
        checkingNewsFilters.resources("#Education");
        checkingNewsFilters.name(1);

    }
}
