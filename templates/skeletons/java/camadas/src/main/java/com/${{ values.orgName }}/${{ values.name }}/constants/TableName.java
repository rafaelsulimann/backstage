package com.${{ values.orgName }}.${{ values.name }}.constants;

public final class TableName {

    public static final String USUARIO = "tb_usuarios";

    private TableName() {
        throw new AssertionError("Não é permitido instanciar esta classe.");
    }

}
