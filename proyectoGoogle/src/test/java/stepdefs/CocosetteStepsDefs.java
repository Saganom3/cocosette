package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CocosettePage;

public class CocosetteStepsDefs {
    CocosettePage cocosettepage = new CocosettePage();

    @Given("^abrir el navegador y navegar a la url \"([^\"]*)\"$")
    public void abrirElNavegadorYNavegarALaUrl(String urls) throws Throwable {
        cocosettepage.navigateToGoogle(urls);
        System.out.println(urls);
    }

    @When("^aparezca la caja de busqueda ingresar \"([^\"]*)\"$")
    public void aparezcaLaCajaDeBusquedaIngresar(String find) throws Throwable {
        cocosettepage.inputSearch(find);
    }

    @Then("^validar el precio y rutas de trasmi$")
    public void validar_el_precio_y_rutas_de_trasmi() {
        System.out.println("valida precio xD xD xD");
        cocosettepage.btnSearch();
    }


}
