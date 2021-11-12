package stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CocosettePage;

public class CocosetteStepsDefs {
 /*   @Steps*/
    CocosettePage cocosettepage = new CocosettePage();

    @Given("^abrir el navegador y navegar a la url de google$")
    public void abrir_el_navegador_y_navegar_a_la_url_de_google() {
        System.out.println("ingresa a l url de google");
        cocosettepage.navigateToGoogle("https://www.google.com");
    }

    @When("^aparezca la caja de busqueda ingresar cocosette$")
    public void aparezca_la_caja_de_busqueda_ingresar_cocosette() {
        System.out.println("ingresa la palabra cocosette");
        cocosettepage.inputSearch();
    }

    @Then("^validar el precio y rutas de trasmi$")
    public void validar_el_precio_y_rutas_de_trasmi() {
        System.out.println("valida precio xD xD xD");
        cocosettepage.btnSearch();
        cocosettepage.cerrar();
    }
}
