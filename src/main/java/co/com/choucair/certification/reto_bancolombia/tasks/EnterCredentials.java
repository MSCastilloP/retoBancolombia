package co.com.choucair.certification.reto_bancolombia.tasks;

import co.com.choucair.certification.reto_bancolombia.userinterface.EvalartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterCredentials implements Task {
    public static EnterCredentials onThePage() {
        return Tasks.instrumented(EnterCredentials.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("539567").into(EvalartHomePage.USER_NAME));
        actor.attemptsTo(Enter.theValue("10df2f32286b7120My0zLTc2NTkzNQ==30e0c83e6c29f1c3").into(EvalartHomePage.PASSWORD));
        actor.attemptsTo(Click.on(EvalartHomePage.BUTTON_SEND));
    }
}
