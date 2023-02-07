package co.com.choucair.certification.reto_bancolombia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automatizacion.feature",
        tags = "@stories3",
        glue = "stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}