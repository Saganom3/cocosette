package stepdefs;

import cucumber.api.java.en.*;
import pages.CocosettePage;

public class CocosetteStepsDefs {
    CocosettePage cocosettepage = new CocosettePage();

    @Given("^abrir el navegador y navegar a la url \"([^\"]*)\"$")
    public void abrirElNavegadorYNavegarALaUrl(String urls) {
        cocosettepage.navigateToGoogle(urls);
        System.out.println(urls);
    }

    @When("^aparezca la caja de busqueda ingresar \"([^\"]*)\"$")
    public void aparezcaLaCajaDeBusquedaIngresar(String find) {

        cocosettepage.inputSearch(find);
    }

    @Then("^validar el precio y rutas de trasmi$")
    public void validarelprecioyrutasdetrasmi() {
        System.out.println("valida precio xD xD xD");
        cocosettepage.btnSearch();
    }
}
