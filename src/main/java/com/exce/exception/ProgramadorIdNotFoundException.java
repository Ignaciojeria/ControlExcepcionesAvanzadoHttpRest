package com.exce.exception;

//Podemos agrupar las excepciones en el paquete exception por tematicas en diferentes sub-paquetes
public class ProgramadorIdNotFoundException extends Exception {

    //Todas las excepciones heredan de exception

    // Niveles de la Excepcion con respecto al nombre que debe tener:

    // 1.- La clase acaba en Exception.

    // 2.- Se indica el tipo de excepcion generica (NotFound)

    // 3.- Se indica cual es el atributo/s de dominio a quien se le aplica esa descripcion generica (ProgramadorId)

    public static final String DESCRIPTION= "Id de programador no encontrada";

    public ProgramadorIdNotFoundException(){
        super(DESCRIPTION);
    }

    public ProgramadorIdNotFoundException(String detail){
        super(DESCRIPTION+ ", "+ detail);
    }

}
