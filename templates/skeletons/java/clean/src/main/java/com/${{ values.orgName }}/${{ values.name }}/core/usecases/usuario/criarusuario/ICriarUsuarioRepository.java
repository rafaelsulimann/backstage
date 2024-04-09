package com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario;

import com.${{ values.orgName }}.${{ values.name }}.domain.entities.IUsuario;

public interface ICriarUsuarioRepository<T extends IUsuario> {

  T salvar(T entity);

}
