package com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario;

import com.${{ values.orgName }}.${{ values.name }}.domain.entities.IUsuario;

public interface ICriarUsuarioMapper<T extends IUsuario> {

  T toEntity(ICriarUsuarioRequest request);
  ICriarUsuarioResponse toResponse(T entity);

}
