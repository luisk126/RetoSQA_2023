package co.sqasa.task;

import co.sqasa.userinterfaces.HomaPageUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class SeleccionaCategoriaAmorTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomaPageUi.BTN_AMOR));
    }
    public static SeleccionaCategoriaAmorTask clickBotonAmor (){
        return Tasks.instrumented(SeleccionaCategoriaAmorTask.class);
    }



}
