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
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{
    
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "quantite")
    private BigDecimal quantite; 

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire; 
    
    @ManyToOne
    @JoinColumn(name = "venteId")
    private Vente vente;
    
    @Column(name = "identreprise")
    private Integer idEntreprise;
}