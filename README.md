# Proyecto Cliente SOAP - Javalin Demo

Proyecto cliente SOAP utilizando la librería [Apache CXF](https://cxf.apache.org/docs/index.html). Proyecto utiliza el WSDL
del proyecto de [Javalin Demo](https://github.com/vacax/javalin-demo), ubicado en la ruta:
http://localhost:7000/ws/EstudianteWebServices?wsdl.

## Ejecución

En linux ejecutar el script:

```
./generacion.sh
```
Utiliza el comando ```wsdl2java```, para convertir el WSDL a Objeto. Una vez ejecutado puede llamar:

```
./gradlew run
```
Nota: Debe tener proyecto Javalin-Demo en ejecución.

## Versiones
* Java 17
* Gradle 8.0
* Apache CXF 4.0.2
* SOAP 1.2