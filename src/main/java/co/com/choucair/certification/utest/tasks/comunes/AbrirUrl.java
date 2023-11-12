package co.com.choucair.certification.utest.tasks.comunes;

import co.com.choucair.certification.utest.userinterface.registrousuario.RegistroUsuarioUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrl implements Task {

    private RegistroUsuarioUserinterface registroUsuarioUserinterface;

    public static AbrirUrl deSitioWeb() {
        return Tasks.instrumented(AbrirUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(registroUsuarioUserinterface));
    }
}
