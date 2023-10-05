package co.sqasa.task;

import co.sqasa.userinterfaces.CategoriaAmorPageUi;
import co.sqasa.userinterfaces.HomaPageUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class AgregarProductoUnoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(CategoriaAmorPageUi.BTN_IMAGEN_PRODUCTO_UNO),
                Click.on(CategoriaAmorPageUi.BTN_AGREGAR_PRODUCTO_UNO));
    }
    public static AgregarProductoUnoTask clickAgregarProducto (){
        return Tasks.instrumented(AgregarProductoUnoTask.class);
    }
}
