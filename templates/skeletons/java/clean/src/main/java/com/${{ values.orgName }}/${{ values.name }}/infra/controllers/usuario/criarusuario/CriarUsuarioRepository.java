package com.${{ values.orgName }}.${{ values.name }}.infra.controllers.usuario.criarusuario;

import org.springframework.stereotype.Component;

import com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario.ICriarUsuarioRepository;
import com.${{ values.orgName }}.${{ values.name }}.infra.entities.UsuarioEntity;
import com.${{ values.orgName }}.${{ values.name }}.infra.repositories.UsuarioRepository;

@Component
public class CriarUsuarioRepository implements ICriarUsuarioRepository<UsuarioEntity>{

  private final UsuarioRepository usuarioRepository;

  public CriarUsuarioRepository(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
  }

  @Override
  public UsuarioEntity salvar(UsuarioEntity entity) {
    return this.usuarioRepository.save(entity);
  }

}
