package co.com.choucair.certification.reto_bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EvalartFinish extends PageObject {
    public static final Target MESSAGE = Target.the("MESSAGE").located(By.xpath("/html/body/div/div/h1"));
    public static final String HASH = "/html/body/div/div/div/p";
}
