package com.bouhouch.gestiondestock.dto;

import com.bouhouch.gestiondestock.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

  private Integer id;

  private String roleName;

  @JsonIgnore
  private UtilisateurDto utilisateur;

  public static RolesDto fromEntity(Role roles) {
    if (roles == null) {
      return null;
    }
    return RolesDto.builder()
        .id(roles.getId())
        .roleName(roles.getRoleName())
        .build();
  }

  public static Role toEntity(RolesDto dto) {
    if (dto == null) {
      return null;
    }
    Role roles = new Role();
    roles.setId(dto.getId());
    roles.setRoleName(dto.getRoleName());
    roles.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));
    return roles;
  }

}
