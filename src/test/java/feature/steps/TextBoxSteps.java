package feature.steps;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import pages.BasePage;
import pages.TextBoxPage;
import java.util.List;
import java.util.Map;

public class TextBoxSteps {

    private BasePage basePage;
    private TextBoxPage textBoxPage;

    @Given("el usuario está en la página de {string}")
    public void el_usuario_esta_en_la_pagina_de_demoqa(String url) {
        basePage = new BasePage();
        textBoxPage = new TextBoxPage();
        basePage.navigateToWeb(url);
    }

    @And("clicamos sobre el apartado {string}")
    public void clicamos_sobre_el_apartado(String section) {
        basePage.clickOnSection(section);
    }

    @And("nos dirigimos a {string}")
    public void nos_dirigimos_a(String option) {
        basePage.navigateToOption(option);
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
