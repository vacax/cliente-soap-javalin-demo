#!/bin/bash
echo "Generando las clases del Servicio en http://localhost:7000/ws/EstudianteWebServices?wsdl"
[ -d ./src/main/java/ws ] && echo "Existe WS... borrando..." && rm -rf ./src/main/java/ws
./apache-cxf-4.0.2/bin/wsdl2java -p ws -client http://localhost:7000/ws/EstudianteWebServices?wsdl
mv ./ws ./src/main/java/