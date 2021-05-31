package co.com.bancolombia.certifacion.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("input para ingresar nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("input para ingresar apellido")
            .locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL = Target.the("input para ingresar email")
            .locatedBy("//input[@id='email']");
    public static final Target SELECT_BIRTH_MONTH = Target.the("Select para ingresar mes de nacimiento")
            .locatedBy("//select[@id='birthMonth']");
    public static final Target SELECT_BIRTH_DAY = Target.the("Select para ingresar día de nacimiento")
            .locatedBy("//select[@id='birthDay']");
    public static final Target SELECT_BIRTH_YEAR = Target.the("Select para ingresas año de nacimiento")
            .locatedBy("//select[@id='birthYear']");
    public static final Target BUTTON_NEXT = Target.the("primer botón para seguir con el formulario")
            .locatedBy("//span[contains(text(), 'Next:')]");
    public static final Target BUTTON_NEXTFORM = Target.the("BTN para avanzar el dispositivo")
            .locatedBy("//a[@class='btn btn-blue pull-right']");
    public static final Target INPUT_PASSWORD = Target.the("input para ingresar la contraseña")
            .locatedBy("//input[@id='password']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("input para confirmar la contraseña")
            .locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_TERMS = Target.the("check para aceptar terminos")
            .locatedBy("//input[@id='termOfUse']");
    public static final Target CHECK_PRIVACY = Target.the("check para aceptar privacidad")
            .locatedBy("//input[@id='privacySetting']");
    public static final Target BUTTON_COMPLETE = Target.the("botón para finalizar con el formulario")
            .locatedBy("//a[@id='laddaBtn']");

}

