package com.${{ values.orgName }}.${{ values.name }}.utils;

import com.${{ values.orgName }}.${{ values.name }}.handlers.exceptions.ResourceNotFoundException;

public abstract class Assert {

    public static void isPresent(Object object, String message, Object... args){
        if(object == null){
            String formattedMessage = String.format(message, args);
            throw new ResourceNotFoundException(formattedMessage);
        }
    }
    
}
