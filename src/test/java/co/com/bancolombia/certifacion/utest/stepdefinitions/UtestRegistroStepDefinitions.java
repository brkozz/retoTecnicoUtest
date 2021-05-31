package co.com.bancolombia.certifacion.utest.stepdefinitions;

import co.com.bancolombia.certifacion.utest.tasks.AbrirPagina;
import co.com.bancolombia.certifacion.utest.tasks.Crear;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;


public class UtestRegistroStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^que usuario ingresa a la pagina web de Utest$")
    public void queUsuarioIngresaALaPaginaWebDeUtest() {
        OnStage.theActor("Brandon").wasAbleTo(
                AbrirPagina.deUtest()
        );

    }

    @When("^cuando intenta registrarse con los datos$")
    public void cuandoIntentaRegistrarseConLosDatos(Map<String, String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Crear.unaCuenta(data)
        );


    }
}
