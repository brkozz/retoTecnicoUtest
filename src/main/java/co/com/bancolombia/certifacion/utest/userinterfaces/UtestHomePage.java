package co.com.bancolombia.certifacion.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class UtestHomePage extends PageObject {

    public static final Target BOTON_JOIN = Target.the("Botón para ingresar al formulario de registro")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");

}
