package co.com.choucair.certification.reto_bancolombia.tasks;

import co.com.choucair.certification.reto_bancolombia.userinterface.EvalartButtonMatriz;
import co.com.choucair.certification.reto_bancolombia.userinterface.EvalartModalSum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class SelectButton implements Task {
    private int numberArray;

    public SelectButton(int number) {
        this.numberArray = number;
    }

    public static SelectButton onThePage(int number) {
        return new SelectButton(number);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String coordinates = actor.asksFor(Text.of(EvalartButtonMatriz.COORDINATESS));
        String str = "";
        if (coordinates.contains(").(")) {
            str = (coordinates.replaceAll(("\\)\\.\\(").toString(), ",")).toString();
        } else if (coordinates.contains(")-(")) {
            str = (coordinates.replaceAll(("\\)-\\(").toString(), ",")).toString();
        } else if (coordinates.contains(");(")) {
            str = (coordinates.replaceAll(("\\);\\(").toString(), ",")).toString();
        } else if (coordinates.contains(")_(")) {
            str = (coordinates.replaceAll(("\\)_\\(").toString(), ",")).toString();
        } else if (coordinates.contains("),(")) {
            str = (coordinates.replaceAll(("\\),\\(").toString(), ",")).toString();
        } else {
            str = (coordinates.replaceAll(("\\)\\*\\(").toString(), ",")).toString();
        }

        str = str.substring(1, str.length() - 1);
        String[] numeros = str.split(",");

        int x = 0, y = 0;
        for (int i = 0; i < numeros.length; i++) {

            if (i % 2 == 0) {
                x += Integer.parseInt(numeros[i]);
            } else {
                y += Integer.parseInt(numeros[i]);
            }

        }
        System.out.println(x + " " + y);
        int suma = 0, array;
        if (numberArray == 1 || numberArray == 6 || numberArray == 8 || numberArray == 9 || numberArray == 11) {
            array = 12;
        } else {
            array = 14;
        }
        System.out.println((x + 1) + (y * array));
        int total = (x + 1) + (y * array);

        actor.attemptsTo(Click.on(EvalartButtonMatriz.BUTTONS + "[" + total + "]"));

        for (int i = 1; i <= array; i++) {
            suma += Integer.parseInt(actor.asksFor(Text.of(EvalartButtonMatriz.BUTTONS + "[" + ((y * array) + i) + "]")));

        }
        System.out.println(suma);
        actor.attemptsTo(Enter.theValue("" + suma).into(EvalartModalSum.INPUT_SUM));
        actor.attemptsTo(Click.on(EvalartModalSum.BUTTON_SEND));
    }
}
