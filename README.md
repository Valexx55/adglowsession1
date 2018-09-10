Lo prometido es deuda: 

Prácticas vistas en la primera sesión implementadas por mí.

Importante que intentéis configurar el mismo entorno JDK8 (no sólo jre) y Apache Tomcat 7.0 (Servlets 3.0)

Proyecto adglowjse
------------------

IOC y DI en proyecto JSE por XML, JCONFIG con y sin dependecias funcionales
Cada caso, está encapsulado en un paquete distinto.

Para probar: Simplemente buscad la clase Main en cada paquete y ejecutarlas.

Proyecto adlowjee
-----------------

Spring en proyecto JEE usando AOP

Para probar: con PostMan ó AdvancedRestClient lanzar una llamada POST a http://localhost:8080/adglowjee/imc con el JSON en el body (pej.) 
{
  "nombre": "Joselito",
  "peso": "80.0",
  "altura": "1.87"
}

Para probar también el otro motédo del controlador, simplemente GET sobre http://localhost:8080/adglowjee/saludo


