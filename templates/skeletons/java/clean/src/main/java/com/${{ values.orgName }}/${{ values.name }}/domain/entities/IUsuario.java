package com.${{ values.orgName }}.${{ values.name }}.domain.entities;

import java.time.LocalDateTime;

import com.${{ values.orgName }}.${{ values.name }}.domain.enums.TipoUsuario;

public interface IUsuario{
  Long getId();
  String getNome();
  String getEmail();
  String getDocumento();
  TipoUsuario getTipo();
  LocalDateTime getDataCriacao();
}
