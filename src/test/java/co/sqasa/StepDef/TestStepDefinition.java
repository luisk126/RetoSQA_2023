package co.sqasa.StepDef;

import co.sqasa.questions.ValidaModuloAmorQuestions;
import co.sqasa.task.AgregarProductoUnoTask;
import co.sqasa.task.SeleccionaCategoriaAmorTask;
import co.sqasa.userinterfaces.CategoriaAmorPageUi;
import io.cucumber.java.Before;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;


public class TestStepDefinition {


    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Dado("que el usuario ingresa a la plataforma de la floristeria mundo amor")
    public void queElUsuarioIngresaALaPlataformaDeLaFloristeriaMundoAmor() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.floristeriamundoflor.com/"));
    }

    @Y("que el usuario ingresa a la categoria amor")
    public void queElUsuarioIngresaALaCategoriaAmor() {
        theActorInTheSpotlight().attemptsTo(SeleccionaCategoriaAmorTask.clickBotonAmor());
    }

    @Entonces("valida si esta en el modulo Amor")
    public void validaSiEstaEnElModuloAmor() {
        theActorInTheSpotlight().should(seeThat(ValidaModuloAmorQuestions.getText(CategoriaAmorPageUi.LBL_AMOR), is(CategoriaAmorPageUi.TITLE_AMOR)));
    }

    @Entonces("valida si esta en el modulo Carrito")
    public void validaSiEstaEnElModuloCarrito() {

    }

    @Entonces("da click a la categoria Amor")
    public void daClickALaCategoriaAmor() {

    }

    @Entonces("da click en el pimer producto para agregar en el carrito de comprar")
    public void daClickEnElPimerProductoParaAgregarEnElCarritoDeComprar() {
        theActorInTheSpotlight().attemptsTo(AgregarProductoUnoTask.clickAgregarProducto());
    }

    @Y("da click en el segundo producto para agregar en el carrito de comprar")
    public void daClickEnElSegundoProductoParaAgregarEnElCarritoDeComprar() {
    }

    @Entonces("valida los productos en el carrito")
    public void validaLosProductosEnElCarrito() {

    }

}
