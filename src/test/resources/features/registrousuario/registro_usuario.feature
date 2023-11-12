#language: es
#Autor: Stiven Hernandez Ramirez

Característica: Sitio web Utest - Registro usuario
  Yo como nuevo usuario de Utest
  Quiero ingresar al sitio web y realizar el registro de mi usuario
  Para poder iniciar sesion y navegar dentro del sitio web

  @RegistroUsuarioValido
  Esquema del escenario: Realizar registro de nuevo usuario correctamente
    Dado que el usuario precarga los datos
      | nombre   | apellido   | email   | mesNacimiento   | diaNacimiento   | anioNacimiento   | idiomasHablados   | password   | city   | cityLista   | codigoPostal   | country   | resultado   | mobile   | mobilModel   | systemOperating   |
      | <nombre> | <apellido> | <email> | <mesNacimiento> | <diaNacimiento> | <anioNacimiento> | <idiomasHablados> | <password> | <city> | <cityLista> | <codigoPostal> | <country> | <resultado> | <mobile> | <mobilModel> | <systemOperating> |
    Y que el usuario se encuentra en la pagina principal del sitio web
    Cuando el usuario diligencia el formulario de registro
    Entonces el usuario se ha registrado exitosamente
    Ejemplos:
      | nombre | apellido  | email                       | mesNacimiento | diaNacimiento | anioNacimiento | idiomasHablados | password    | city  | cityLista           | codigoPostal | country  | resultado                                                               | mobile | mobilModel     | systemOperating |
      | Stiven | Hernandez | stivenPrueba28@choucair.com | October       | 23            | 1999           | Spanish         | Prueba123.. | Bello | Antioquia, Colombia | 051050       | Colombia | Welcome to the world's largest community of freelance software testers! | Apple  | iPhone 15 Plus | iOS 17.2 Beta   |

