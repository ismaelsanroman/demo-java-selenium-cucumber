package pages;

import org.openqa.selenium.By;

public class TextBoxPage extends BasePage {

    private By fullNameInput = By.id("userName");
    private By emailInput = By.id("userEmail");
    private By currentAddressInput = By.id("currentAddress");
    private By permanentAddressInput = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By outputBox = By.id("output");

    public TextBoxPage() {
        super();
    }

    public void fillForm(String fullName, String email, String currentAddress, String permanentAddress) {
        driver.findElement(fullNameInput).sendKeys(fullName);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(currentAddressInput).sendKeys(currentAddress);
        driver.findElement(permanentAddressInput).sendKeys(permanentAddress);
        driver.findElement(submitButton).click();
    }

    public void verifyFormSubmission() {
        boolean isDisplayed = driver.findElement(outputBox).isDisplayed();
        if (!isDisplayed) {
            throw new AssertionError("El formulario no se envió correctamente");
        }
    }
}
