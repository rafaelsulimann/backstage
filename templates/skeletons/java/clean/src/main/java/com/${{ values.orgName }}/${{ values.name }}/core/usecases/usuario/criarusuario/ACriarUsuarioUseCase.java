package com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario;

import com.${{ values.orgName }}.${{ values.name }}.core.domain.entities.IUsuario;

public abstract class ACriarUsuarioUseCase<T extends IUsuario> {

  private final ICriarUsuarioMapper<T> mapper;
  private final ICriarUsuarioRepository<T> usuarioRepository;

  public ACriarUsuarioUseCase(ICriarUsuarioMapper<T> mapper, ICriarUsuarioRepository<T> usuarioRepository) {
    this.mapper = mapper;
    this.usuarioRepository = usuarioRepository;
  }

  public ICriarUsuarioResponse criarUsuario(ICriarUsuarioRequest request) {
    T entity = this.mapper.toEntity(request);
    entity = this.usuarioRepository.salvar(entity);
    return this.mapper.toResponse(entity);
  }

}
