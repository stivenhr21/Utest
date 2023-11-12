package co.com.choucair.certification.utest.tasks.registrousuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.certification.utest.models.DatosPrueba.obtener;
import static co.com.choucair.certification.utest.userinterface.registrousuario.RegistroUsuarioUserinterface.*;

public class PasoUno implements Task {

    public static PasoUno nuevo() {
        return Tasks.instrumented(PasoUno.class);
    }

    @Step("{0} ingresa la informacion en el paso 1: Cuentanos acerca de ti")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOIN_TODAY),
                Enter.theValue(obtener("nombre")).into(INPUT_FIRST_NAME),
                Enter.theValue(obtener("apellido")).into(INPUT_LAST_NAME),
                Enter.theValue(obtener("email")).into(INPUT_EMAIL_ADDRESS),
                Click.on(SELECT_BIRTH_MONTH.of(obtener("mesNacimiento"))),
                Click.on(SELECT_BIRTHDAY.of(obtener("diaNacimiento"))),
                Click.on(SELECT_BIRTH_YEAR.of(obtener("anioNacimiento"))),
                Enter.theValue(obtener("idiomasHablados")).into(INPUT_LANGUAGES),
                Click.on(BTN_BLUE)
        );
    }
    public static PasoUno cuentanosDeTi(){
        return Tasks.instrumented(PasoUno.class);
    }
}
