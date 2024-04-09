package com.${{ values.orgName }}.${{ values.name }}.infra.controllers.usuario.criarusuario;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.stereotype.Component;

import com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario.ICriarUsuarioMapper;
import com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario.ICriarUsuarioRequest;
import com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario.ICriarUsuarioResponse;
import com.${{ values.orgName }}.${{ values.name }}.domain.enums.TipoUsuario;
import com.${{ values.orgName }}.${{ values.name }}.infra.entities.UsuarioEntity;

@Component
public class CriarUsuarioMapper implements ICriarUsuarioMapper<UsuarioEntity>{

  @Override
  public UsuarioEntity toEntity(ICriarUsuarioRequest request) {
    return new UsuarioEntity(request.getNome(), request.getEmail(), request.getDocumento(), TipoUsuario.valueOf(request.getTipo()), LocalDateTime.now(ZoneId.of("UTC")));
  }

  @Override
  public ICriarUsuarioResponse toResponse(UsuarioEntity entity) {
    return CriarUsuarioResponse.builder()
            .id(entity.getId())
            .nome(entity.getNome())
            .email(entity.getEmail())
            .documento(entity.getDocumento())
            .tipo(entity.getTipo())
            .dataCriacao(entity.getDataCriacao()).build();
  }

}
