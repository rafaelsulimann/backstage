package com.${{ values.orgName }}.${{ values.name }}.utils.http;

import org.springframework.http.HttpMethod;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Post extends HttpPadrao {

    @Override
    protected HttpMethod method() {
        return HttpMethod.POST;
    }

}
