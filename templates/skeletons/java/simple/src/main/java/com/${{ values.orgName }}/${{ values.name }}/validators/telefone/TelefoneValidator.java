package com.${{ values.orgName }}.${{ values.name }}.validators.telefone;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.${{ values.orgName }}.${{ values.name }}.utils.Regex;

public class TelefoneValidator implements ConstraintValidator<Telefone, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        return value.matches(Regex.CELULAR);
    }

}
