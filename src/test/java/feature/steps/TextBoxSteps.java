package feature.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import pages.TextBoxPage;
import pages.HomePage;
import pages.ElementsPage;
import utils.DriverManager;
import java.util.List;
import java.util.Map;

public class TextBoxSteps {
    
    private WebDriver driver;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;

    @Given("el usuario está en la página de DemoQA")
    public void el_usuario_esta_en_la_pagina_de_demoqa() {
        driver = DriverManager.getDriver();
        driver.get("https://demoqa.com/");
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    @And("clicamos sobre el apartado {string}")
    public void clicamos_sobre_el_apartado(String section) {
        homePage.clickOnSection(section);
    }

    @And("nos dirigimos a {string}")
    public void nos_dirigimos_a(String option) {
        elementsPage.navigateToOption(option);
    }

    @When("interactúa con el formulario de registro")
    public void interactua_con_el_formulario_de_registro(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String fullName = data.get(0).get("full_name");
        String email = data.get(0).get("email");
        String currentAddress = data.get(0).get("current_address");
        String permanentAddress = data.get(0).get("permanent_address");

        textBoxPage.fillForm(fullName, email, currentAddress, permanentAddress);
    }

    @Then("el formulario es enviado correctamente")
    public void el_formulario_es_enviado_correctamente() {
        textBoxPage.verifyFormSubmission();
    }
}
