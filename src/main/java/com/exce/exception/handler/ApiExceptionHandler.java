package com.exce.exception.handler;

import com.exce.exception.ProgramadorIdNotFoundException;
import com.exce.exception.ProgramadorRutNotFoundException;
import com.exce.exception.message.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class ApiExceptionHandler {

    //Acá se agrupa el conjunto de clases de excepciones que aplican al HttpStatus.NOT_FOUND.
    //Esas excepciones son desencadenadas por la lógica de negocio en el servicio
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({ProgramadorIdNotFoundException.class,
                        ProgramadorRutNotFoundException.class})
    @ResponseBody
    public ErrorMessage notFountRequest(HttpServletRequest request, Exception exception){
        return  new ErrorMessage(exception,request.getRequestURI());
    }
}
