package com.${{ values.orgName }}.${{ values.name }}.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.${{ values.orgName }}.${{ values.name }}.infra.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
