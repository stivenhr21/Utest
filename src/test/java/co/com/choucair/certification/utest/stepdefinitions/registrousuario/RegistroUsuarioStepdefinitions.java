package co.com.choucair.certification.utest.stepdefinitions.registrousuario;

import co.com.choucair.certification.utest.questions.registrousuario.RegistroUsuario;
import co.com.choucair.certification.utest.tasks.comunes.AbrirUrl;
import co.com.choucair.certification.utest.tasks.registrousuario.RegistrarUsuario;
import co.com.choucair.certification.utest.util.transversal.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.choucair.certification.utest.models.DatosPrueba.obtener;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroUsuarioStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) precarga los datos$")
    public void queElUsuarioPrecargaLosDatos(String actor,List<Map<String, Object>> informacion) {
        theActorCalled(actor).wasAbleTo(CargarDatos.conLaSiguiente(informacion));
    }
    @Y("^que el usuario se encuentra en la pagina principal del sitio web$")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipalDelSitioWeb() {
        OnStage.theActorCalled("El actor").wasAbleTo(AbrirUrl.deSitioWeb());
    }

    @Cuando("^el usuario diligencia el formulario de registro$")
    public void elUsuarioDiligenciaElFormularioDeRegistro() {
        theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.nuevo());
    }

    @Entonces("^el usuario se ha registrado exitosamente$")
    public void elUsuarioSeHaRegistradoExitosamente() {
        theActorInTheSpotlight().should(
                seeThat("La Pagina de Bienvenida es Visualizada", RegistroUsuario.registro(), equalTo(obtener("resultado")))
        );

    }
}
