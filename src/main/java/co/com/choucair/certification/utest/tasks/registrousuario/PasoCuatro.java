package co.com.choucair.certification.utest.tasks.registrousuario;

import co.com.choucair.certification.utest.util.transversal.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.certification.utest.models.DatosPrueba.obtener;
import static co.com.choucair.certification.utest.userinterface.registrousuario.RegistroUsuarioUserinterface.*;

public class PasoCuatro implements Task {

    public static PasoCuatro nuevo() {
        return Tasks.instrumented(PasoCuatro.class);
    }

    @Step("{0} ingresa la informacion de el ultimo paso")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("password")).into(INPUT_PASSWORD),
                Enter.theValue(obtener("password")).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_OPTIONAL),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACY_Y_SECURITY_POLICY),
                Click.on(BTN_BLUE),
                Esperar.unTiempo(5000)
        );
    }
    public static PasoCuatro ultimoPaso(){
        return Tasks.instrumented(PasoCuatro.class);
    }
}
