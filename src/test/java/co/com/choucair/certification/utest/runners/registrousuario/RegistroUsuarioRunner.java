package co.com.choucair.certification.utest.runners.registrousuario;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrousuario/registro_usuario.feature",
        glue = "co.com.choucair.certification.utest.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@RegistroUsuarioValido"
)
public class RegistroUsuarioRunner {
}
