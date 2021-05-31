package co.com.bancolombia.certifacion.utest.tasks;

import co.com.bancolombia.certifacion.utest.userinterfaces.RegistroPage;
import co.com.bancolombia.certifacion.utest.userinterfaces.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Crear implements Task {
    private final Map<String, String> data;

    public Crear(Map<String, String> data) {
        this.data = data;

    }

    public static Performable unaCuenta(Map<String, String> data) {
        return instrumented(Crear.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestHomePage.BOTON_JOIN)
        );
        actor.attemptsTo(
                Enter.keyValues(data.get("firstName")).into(RegistroPage.INPUT_FIRSTNAME),
                Enter.keyValues(data.get("lastName")).into(RegistroPage.INPUT_LASTNAME),
                Enter.keyValues(data.get("email")).into(RegistroPage.INPUT_EMAIL)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(data.get("birthMonth")).from(RegistroPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get("birthDay")).from(RegistroPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get("birthYear")).from(RegistroPage.SELECT_BIRTH_YEAR)
        );
        actor.attemptsTo(
                Click.on(RegistroPage.BUTTON_NEXT)
        );

        actor.attemptsTo(
                WaitUntil.the(RegistroPage.BUTTON_NEXT, isEnabled()).
                        forNoMoreThan(4000).milliseconds()
        );

        actor.attemptsTo(
                Click.on(RegistroPage.BUTTON_NEXT)
        );


        actor.attemptsTo(
                WaitUntil.the(RegistroPage.BUTTON_NEXT, isClickable()).
                        forNoMoreThan(50000).milliseconds()
        );

        actor.attemptsTo(
                Click.on(RegistroPage.BUTTON_NEXTFORM)
        );

        actor.attemptsTo(
                Enter.keyValues(data.get("password")).into(RegistroPage.INPUT_PASSWORD),
                Enter.keyValues(data.get("password")).into(RegistroPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistroPage.CHECK_TERMS),
                Click.on(RegistroPage.CHECK_PRIVACY)

        );
        actor.attemptsTo(
                Click.on(RegistroPage.BUTTON_COMPLETE)
        );


    }
}
