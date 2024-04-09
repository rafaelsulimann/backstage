package com.${{ values.orgName }}.${{ values.name }}.infra.controllers.usuario.criarusuario;

import org.springframework.stereotype.Component;

import com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario.ACriarUsuarioUseCase;
import com.${{ values.orgName }}.${{ values.name }}.infra.entities.UsuarioEntity;

@Component
public class CriarUsuarioUseCase extends ACriarUsuarioUseCase<UsuarioEntity>{

  public CriarUsuarioUseCase(CriarUsuarioMapper criarUsuarioMapper, CriarUsuarioRepository criarUsuarioRepository) {
    super(criarUsuarioMapper, criarUsuarioRepository);
  }

}
