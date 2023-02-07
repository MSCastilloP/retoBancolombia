package co.com.choucair.certification.reto_bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class EvalartHomePage extends PageObject {
    public static final Target USER_NAME = Target.the("user name").located(By.xpath("/html/body/div/div[2]/form/input[1]"));
    public static final Target PASSWORD = Target.the("user password").located(By.xpath("/html/body/div/div[2]/form/input[2]"));
    public static final Target BUTTON_SEND = Target.the("button send").located(By.xpath("/html/body/div/div[2]/form/button"));
}

