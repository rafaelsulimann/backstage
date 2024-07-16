package com.${{ values.orgName }}.${{ values.name }}.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.${{ values.orgName }}.${{ values.name }}.exceptions.PicPayException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        var fieldErrors = e.getFieldErrors()
            .stream()
            .map(fe -> new FieldErrorDetail(fe.getField(), fe.getDefaultMessage()))
            .toList();

        var pb = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);

        pb.setTitle("Requisição inválida");
        pb.setProperty("Invalid Params", fieldErrors);

        return pb;
    }

    @ExceptionHandler(${{ values.name }}Exception.class)
    public ProblemDetail handle${{ values.name }}Exception(${{ values.name }}Exception e){
        return e.toProblemDetail();
    }

    private record FieldErrorDetail(String field, String message){}

}
