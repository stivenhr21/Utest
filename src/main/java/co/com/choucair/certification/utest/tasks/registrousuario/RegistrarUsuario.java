package co.com.choucair.certification.utest.tasks.registrousuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class RegistrarUsuario implements Task {

    public static RegistrarUsuario nuevo() {
        return Tasks.instrumented(RegistrarUsuario.class);
    }
    @Step("{0} diligencia informacion para crear usuario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PasoUno.cuentanosDeTi(),
                PasoDos.ubicacion(),
                PasoTres.dispositivos(),
                PasoCuatro.ultimoPaso()
        );
    }
    public static RegistrarUsuario registrar(){
        return Tasks.instrumented(RegistrarUsuario.class);
    }
}
