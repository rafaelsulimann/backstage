package com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario;

import java.time.LocalDateTime;

import com.${{ values.orgName }}.${{ values.name }}.core.domain.enums.TipoUsuario;

public interface ICriarUsuarioResponse {

  Long getId();
  String getNome();
  String getEmail();
  String getDocumento();
  TipoUsuario getTipo();
  LocalDateTime getDataCriacao();

}
