package com.bouhouch.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.bouhouch.gestiondestock.model.Vente;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {

  private Integer id;

  private String code;

  private Instant dateVente;

  private String commentaire;

  private List<LigneVenteDto> ligneVentes;

  private Integer idEntreprise;

  public static VentesDto fromEntity(Vente vente) {
    if (vente == null) {
      return null;
    }
    return VentesDto.builder()
        .id(vente.getId())
        .code(vente.getCode())
        .commentaire(vente.getCommentaire())
        .idEntreprise(vente.getIdEntreprise())
        .build();
  }

  public static Vente toEntity(VentesDto dto) {
    if (dto == null) {
      return null;
    }
    Vente ventes = new Vente();
    ventes.setId(dto.getId());
    ventes.setCode(ventes.getCode());
    ventes.setCommentaire(dto.getCommentaire());
    ventes.setIdEntreprise(dto.getIdEntreprise());
    return ventes;
  }
}
