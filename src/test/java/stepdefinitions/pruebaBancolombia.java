package stepdefinitions;

import co.com.choucair.certification.reto_bancolombia.questions.Answer;
import co.com.choucair.certification.reto_bancolombia.tasks.EnterCredentials;
import co.com.choucair.certification.reto_bancolombia.tasks.OpenUp;
import co.com.choucair.certification.reto_bancolombia.tasks.SelectButton;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class pruebaBancolombia {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user santiago correctly enters the page evalart")
    public void theUserSantiagoCorrectlyEntersThePageEvalart() {
        OnStage.theActorCalled("Santiago").attemptsTo(OpenUp.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentials.onThePage());
    }

    @When("When he operates the coordinates given by the page, he selects a button and does the operations that are asked for")
    public void whenHeOperatesTheCoordinatesGivenByThePageHeSelectsAButtonAndDoesTheOperationsThatAreAskedFor() {
        for (int i = 1; i <= 11; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(SelectButton.onThePage(i));
        }


    }

    @Then("you get a completion hash")
    public void youGetACompletionHash() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Felicidades, has terminado la prueba exitosamente")));
    }

}
