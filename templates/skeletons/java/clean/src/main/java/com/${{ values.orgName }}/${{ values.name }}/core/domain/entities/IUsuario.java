package com.${{ values.orgName }}.${{ values.name }}.core.domain.entities;

import java.time.LocalDateTime;

import com.${{ values.orgName }}.${{ values.name }}.core.domain.enums.TipoUsuario;

public interface IUsuario{
  Long getId();
  String getNome();
  String getEmail();
  String getDocumento();
  TipoUsuario getTipo();
  LocalDateTime getDataCriacao();
}
