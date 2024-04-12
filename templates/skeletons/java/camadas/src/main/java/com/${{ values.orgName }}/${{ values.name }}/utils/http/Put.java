package com.${{ values.orgName }}.${{ values.name }}.utils.http;

import org.springframework.http.HttpMethod;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Put extends HttpPadrao {

    @Override
    protected HttpMethod method() {
        return HttpMethod.PUT;
    }

}
