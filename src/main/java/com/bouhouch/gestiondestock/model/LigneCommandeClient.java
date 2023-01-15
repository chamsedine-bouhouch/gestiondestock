package com.bouhouch.gestiondestock.model;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "ligneCommandeClient")
public class LigneCommandeClient extends AbstractEntity {

    @Column(name = "quantite")
    private BigDecimal quantite; 

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;    

    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "commandeClientId")
    private CommandeClient commandeClient;

    @Column(name = "identreprise")
    private Integer idEntreprise;
}
