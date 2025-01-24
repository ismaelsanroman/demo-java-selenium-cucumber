package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.Map;

public class TextBoxPage extends BasePage {

    private By fullNameInput = By.id("userName");
    private By emailInput = By.id("userEmail");
    private By currentAddressInput = By.id("currentAddress");
    private By permanentAddressInput = By.id("permanentAddress");
    private By submitButton = By.xpath("//*[@id='submit']");
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

    public void verifyFormSubmission(Map<String, String> expectedValues) {
        // Verifica que la caja de salida se haya mostrado
        WebElement output = driver.findElement(outputBox);
        Assert.assertTrue(output.isDisplayed(), "El formulario no se envió correctamente");
    
        // Construcción de los valores esperados
        String expectedFullName = "Name:" + expectedValues.get("full_name");
        String expectedEmail = "Email:" + expectedValues.get("email");
        String expectedCurrentAddress = "Current Address :" + expectedValues.get("current_address");
        String expectedPermanentAddress = "Permananet Address :" + expectedValues.get("permanent_address");
    
        // Obtención de los valores reales desde la página
        String actualFullName = driver.findElement(By.id("name")).getText();
        String actualEmail = driver.findElement(By.id("email")).getText();
        String actualCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
        String actualPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
    
        // Validación de los valores ingresados vs los valores mostrados
        Assert.assertEquals(actualFullName, expectedFullName, "Error: El nombre no coincide.");
        Assert.assertEquals(actualEmail, expectedEmail, "Error: El email no coincide.");
        Assert.assertEquals(actualCurrentAddress, expectedCurrentAddress, "Error: La dirección actual no coincide.");
        Assert.assertEquals(actualPermanentAddress, expectedPermanentAddress, "Error: La dirección permanente no coincide.");
    }
}