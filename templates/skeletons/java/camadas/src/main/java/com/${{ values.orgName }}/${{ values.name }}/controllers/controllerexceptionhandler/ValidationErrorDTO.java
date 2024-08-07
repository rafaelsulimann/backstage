package com.${{ values.orgName }}.${{ values.name }}.controllers.controllerexceptionhandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.${{ values.orgName }}.${{ values.name }}.utils.httpresponse.ErroResponse;

public class ValidationErrorDTO extends ErroResponse{

    List<FieldMessageDTO> errors = new ArrayList<>();

    public ValidationErrorDTO(LocalDateTime timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessageDTO> getErrors() {
        return errors;
    }

    public void addError(FieldMessageDTO error) {
        errors.removeIf(x -> x.getFieldName().equals(error.getFieldName()));
        errors.add(error);
    }

}
