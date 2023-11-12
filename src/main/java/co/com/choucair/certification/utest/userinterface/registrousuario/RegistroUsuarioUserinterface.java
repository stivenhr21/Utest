package co.com.choucair.certification.utest.userinterface.registrousuario;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioUserinterface extends PageObject {

    public static final Target BTN_JOIN_TODAY = Target.the("Opcion del menu de navegacion para ingresar al formulario de registro de usuario").located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_FIRST_NAME = Target.the("Input nombre del formulario de registro de usuario").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Input apellido del formulario de registro de usuario").located(By.id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Input email del formulario de registro de usuario").located(By.id("email"));

    public static final Target SELECT_BIRTH_MONTH = Target.the("Campo mes de nacimiento del formulario de registro de usuario").locatedBy("//select[@id = 'birthMonth']//option[contains(., '{0}')]");

    public static final Target SELECT_BIRTHDAY = Target.the("Campo dia de nacimiento del formulario de registro de usuario").locatedBy("//select[@id = 'birthDay']//option[contains(., '{0}')]");

    public static final Target SELECT_BIRTH_YEAR = Target.the("Campo anio de nacimiento del formulario de registro de usuario").locatedBy("//select[@id = 'birthYear']//option[contains(., '{0}')]");

    public static final Target INPUT_LANGUAGES = Target.the("Input idiomas hablados del formulario de registro de usuario").located(By.xpath("//input[@class = 'ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));

    public static final Target BTN_BLUE = Target.the("Boton del formulario de registro de usuario para avanzar a la pantalla de ubicacion").located(By.cssSelector("a[role='button']"));
    public static final Target CITY = Target.the("campo ciudad").located(By.cssSelector("input[id='city']"));
    public static final Target CITY_LISTA = Target.the("lista de ciudades").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target ZIP_CODE = Target.the("campo codigo postal").located(By.cssSelector("input[id='zip']"));
    public static final Target COUNTRY = Target.the("campo pais").located(By.cssSelector("div[name='countryId']"));
    public static final Target COUNTRY_LISTA = Target.the("lista de paises").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target MOBILE = Target.the("campo para seleccionar mobil").located(By.cssSelector("div[name='handsetMakerId']"));

    public static final Target MOBILE_LIS = Target.the("lista de mobiles").locatedBy("//div[contains(text(),'{0}')]");

    public static final Target MOBILE_MODEL = Target.the("campo para seleccionar modelo del mobil").located(By.cssSelector("div[name='handsetModelId']"));

    public static final Target MOBILE_MODEL_LIST = Target.the("lista de modelos").locatedBy("//div[contains(text(),'{0}')]");

    public static final Target SYSTEM_OPERATING = Target.the("campo para seleccionar sistema operativo").located(By.cssSelector("div[name='handsetOSId']"));
    public static final Target SYSTEM_OPERATING_LIST = Target.the("lista de sistema operativos").locatedBy("//div[contains(text(),'{0}')]");

    public static final Target INPUT_PASSWORD = Target.the("Input clave del formulario de registro de usuario").located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input confirmar clave del formulario de registro de usuario").located(By.id("confirmPassword"));

    public static final Target CHECKBOX_OPTIONAL = Target.the("Checkbox opcional del formulario de registro de usuario").located(By.xpath("//span[@class = 'checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Checkbox terminos y condiciones del formulario de registro de usuario").located(By.xpath("//input[@id='termOfUse']"));

    public static final Target CHECKBOX_PRIVACY_Y_SECURITY_POLICY = Target.the("Checkbox politica de privacidad y seguridad del formulario de registro de usuario").located(By.xpath("//input[@id='privacySetting']"));
    public static final String MENSAJE_BIENVENIDA = "//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]";

    private RegistroUsuarioUserinterface() {
    }
}