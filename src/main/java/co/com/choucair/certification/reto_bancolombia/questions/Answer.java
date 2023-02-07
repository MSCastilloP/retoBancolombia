package co.com.choucair.certification.reto_bancolombia.questions;

import co.com.choucair.certification.reto_bancolombia.userinterface.EvalartFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String str = actor.asksFor(Text.of(EvalartFinish.MESSAGE));
        if (str.equals(question)) {
            return true;
        } else {
            return false;
        }
    }
}
