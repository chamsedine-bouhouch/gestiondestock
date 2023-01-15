package com.bouhouch.gestiondestock.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "email")
    private String email;

    @Column(name = "photo")
    private String photo;
    
    @Column(name = "numTel")
    private String numTel;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "steWeb")
    private String steWeb;
    
    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
