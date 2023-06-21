package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FillForm;

@Tag("final")
public class FillFormTest extends TestBase {
    FillForm fillForm = new FillForm();

    @Test
    public void checkFormFields() {

        fillForm.openPage();
        fillForm.requiredFields();
    }

    @Test
    void checkRequiredFieldErrorMessages() {
        fillForm.openPage();
        fillForm.clickSendButton();
        fillForm.fillingInTheRequiredFields(6);
    }

}
