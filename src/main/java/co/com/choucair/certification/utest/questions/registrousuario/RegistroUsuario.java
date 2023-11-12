package co.com.choucair.certification.utest.questions.registrousuario;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

import static co.com.choucair.certification.utest.userinterface.registrousuario.RegistroUsuarioUserinterface.MENSAJE_BIENVENIDA;

public class RegistroUsuario implements Question<String> {

    public static RegistroUsuario registro(){
        return new RegistroUsuario();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(By.xpath(MENSAJE_BIENVENIDA)).getText();
    }
}
