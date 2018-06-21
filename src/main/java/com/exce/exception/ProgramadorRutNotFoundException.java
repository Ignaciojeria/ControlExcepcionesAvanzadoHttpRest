package com.exce.exception;

public class ProgramadorRutNotFoundException extends Exception {
    public static final String DESCRIPTION= "rut del programador no encontrado";

    public ProgramadorRutNotFoundException(){
        super(DESCRIPTION);
    }

    public ProgramadorRutNotFoundException(String detail){
        super(DESCRIPTION+", "+detail);
    }

}
