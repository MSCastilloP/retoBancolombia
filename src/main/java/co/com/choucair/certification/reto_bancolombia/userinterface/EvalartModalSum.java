package co.com.choucair.certification.reto_bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EvalartModalSum extends PageObject {
    public static final Target INPUT_SUM = Target.the("INPUT_SUM").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/form/input"));
    public static final Target BUTTON_SEND = Target.the("button send").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/form/button"));

}
