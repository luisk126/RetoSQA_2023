package co.sqasa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidaModuloAmorQuestions implements Question<String> {

    private Target target;

    public ValidaModuloAmorQuestions(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
    public static ValidaModuloAmorQuestions getText (Target target){
        return new ValidaModuloAmorQuestions(target);
    }
}
