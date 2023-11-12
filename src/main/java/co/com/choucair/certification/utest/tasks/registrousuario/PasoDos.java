package co.com.choucair.certification.utest.tasks.registrousuario;

import co.com.choucair.certification.utest.util.transversal.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.certification.utest.models.DatosPrueba.obtener;
import static co.com.choucair.certification.utest.userinterface.registrousuario.RegistroUsuarioUserinterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PasoDos implements Task {

    public static PasoDos nuevo() {
        return Tasks.instrumented(PasoDos.class);
    }
    @Step("{0} agrega la direccion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(2000),
                Clear.field(ZIP_CODE),
                Enter.theValue(obtener("city")).into(CITY),
                WaitUntil.the(CITY_LISTA.of(obtener("cityLista")), isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CITY_LISTA.of(obtener("cityLista"))),
                Enter.theValue(obtener("codigoPostal")).into(ZIP_CODE),
                Click.on(COUNTRY),
                Click.on(COUNTRY_LISTA.of(obtener("country"))),
                Click.on(BTN_BLUE)
        );
    }
    public static PasoDos ubicacion(){
        return Tasks.instrumented(PasoDos.class);
    }
}
