package com.${{ values.orgName }}.${{ values.name }}.constants;

public final class Path {

    public static final String USUARIO = "/usuarios";

    private Path() {
        throw new AssertionError("Não é permitido instanciar esta classe.");
    }

}
