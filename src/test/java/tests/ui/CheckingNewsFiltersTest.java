package tests.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ResourcesPage;

@Tag("final")
public class CheckingNewsFiltersTest extends TestBase {
    ResourcesPage resourcesPage = new ResourcesPage();

    @Test

    public void resourceOutput() {
        resourcesPage.openPage();
        resourcesPage.resources("#Education");
        resourcesPage.name(1);

    }
}
