package co.com.choucair.certification.utest.tasks.registrousuario;

import co.com.choucair.certification.utest.util.transversal.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.certification.utest.models.DatosPrueba.obtener;
import static co.com.choucair.certification.utest.userinterface.registrousuario.RegistroUsuarioUserinterface.*;

public class PasoTres implements Task {

    public static PasoTres nuevo() {
        return Tasks.instrumented(PasoTres.class);
    }
    @Step("{0} ingresa la informacion sobre sus dispositivos")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(2000),
                Click.on(MOBILE),
                Click.on(MOBILE_LIS.of(obtener("mobile"))),
                Click.on(MOBILE_MODEL),
                Click.on(MOBILE_MODEL_LIST.of(obtener("mobilModel"))),
                Click.on(SYSTEM_OPERATING),
                Click.on(SYSTEM_OPERATING_LIST.of(obtener("systemOperating"))),
                Click.on(BTN_BLUE)
        );
    }
    public static PasoTres dispositivos(){
        return Tasks.instrumented(PasoTres.class);
    }
}
