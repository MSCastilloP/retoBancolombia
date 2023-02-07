package co.com.choucair.certification.reto_bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EvalartButtonMatriz extends PageObject {
    public static final Target COORDINATESS = Target.the("coordinatess").located(By.xpath("/html/body/div[2]/div[1]/p[2]"));
    public static final String BUTTONS = "/html/body/div[3]/form/div/button";
}
