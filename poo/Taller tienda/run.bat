@echo off
echo ..:: Limpiando Proyecto ::..
del build\modelo\*.class
del build\vista\*.class
del build\controlador\*.class
echo ..:: Compilando Proyecto ::..
javac -cp .\build\modelo\.;.\build\vista\.;.\build\controlador\. -d .\build\modelo\ .\src\modelo\Cliente.java
javac -cp .\build\modelo\.;.\build\vista\.;.\build\controlador\. -d .\build\vista\ .\src\vista\Principal.java

echo "..:: Ejecutando Clase Principal ::.."
java -cp .\build\modelo\.;.\build\vista\.;.\build\controlador\. Principal
pause