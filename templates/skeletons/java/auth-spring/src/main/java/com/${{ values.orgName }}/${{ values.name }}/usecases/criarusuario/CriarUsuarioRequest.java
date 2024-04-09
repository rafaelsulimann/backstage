package com.${{ values.orgName }}.${{ values.name }}.usecases.criarusuario;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.${{ values.orgName }}.${{ values.name }}.models.Usuario;
import com.${{ values.orgName }}.${{ values.name }}.utils.ErrorMessage;
import com.${{ values.orgName }}.${{ values.name }}.utils.validators.uniquevalue.UniqueValue;

import lombok.Getter;

@Getter
public class CriarUsuarioRequest implements Serializable{

    private static final long serialVersionUID = 1L;

    @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
    @UniqueValue(domainClass = Usuario.class, fieldName = "nome", message = "Nome já existente")
    private String nome;

    @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
    @Email(message = "Email inválido")
    @UniqueValue(domainClass = Usuario.class, fieldName = "email", message = "Email já existente")
    private String email;

    @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
    @Length(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private String senha;

    public Usuario toUsuario() {
        return new Usuario(this.nome, this.email, this.senha);
    }

}
