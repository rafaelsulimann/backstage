package com.${{ values.orgName }}.${{ values.name }}.infra.controllers.usuario.criarusuario;

import com.${{ values.orgName }}.${{ values.name }}.core.constants.ErrorMessage;
import com.${{ values.orgName }}.${{ values.name }}.core.usecases.usuario.criarusuario.ICriarUsuarioRequest;
import com.${{ values.orgName }}.${{ values.name }}.domain.enums.TipoUsuario;
import com.${{ values.orgName }}.${{ values.name }}.infra.entities.UsuarioEntity;
import com.${{ values.orgName }}.${{ values.name }}.infra.utils.validators.cpforcnpj.CpfOrCnpj;
import com.${{ values.orgName }}.${{ values.name }}.infra.utils.validators.uniquevalue.UniqueValue;
import com.${{ values.orgName }}.${{ values.name }}.infra.utils.validators.validenum.ValidEnum;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CriarUsuarioRequest implements ICriarUsuarioRequest{

  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  private String nome;

  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  @Email(message = "Email inválido")
  @UniqueValue(domainClass = UsuarioEntity.class, fieldName = "email", message = "Email já existente")
  private String email;

  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  @UniqueValue(domainClass = UsuarioEntity.class, fieldName = "documento", message = "Documento já existente")
  @CpfOrCnpj(message = "Documento deve ser um CPF ou CNPJ")
  private String documento;

  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  @ValidEnum(enumClass = TipoUsuario.class, message = "Tipo de usuário inválido")
  private String tipo;

}
