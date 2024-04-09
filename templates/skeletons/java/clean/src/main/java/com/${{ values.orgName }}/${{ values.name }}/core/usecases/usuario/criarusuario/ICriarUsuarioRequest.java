package com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario;

public interface ICriarUsuarioRequest {

  String getNome();
  String getEmail();
  String getDocumento();
  String getTipo();

}
