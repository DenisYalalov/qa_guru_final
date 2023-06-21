package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FillForm;
@Tag("final")
public class FillFormTest extends TestBase{
    FillForm fillForm = new FillForm();
    @Test
    public void testForm() {

        fillForm.openPage();
        fillForm.requiredFields();
    }
    @Test
    void testForm2() {
        fillForm.fillingInTheRequiredFields();
    }

}
