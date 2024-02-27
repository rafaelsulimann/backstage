package com.${{ values.orgName }}.${{ values.name }}.usecases.obterusuariologado;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.${{ values.orgName }}.${{ values.name }}.models.Usuario;

@Repository
public interface ObterUsuarioLogadoRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByEmail(String email);

}
