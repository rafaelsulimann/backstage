package com.${{ values.orgName }}.${{ values.name }}.controllers.controllerexceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FieldMessageDTO {

    private String fieldName;
    private String message;

}
