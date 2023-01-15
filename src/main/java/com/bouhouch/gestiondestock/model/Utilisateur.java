package com.bouhouch.gestiondestock.model;
import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "numTel")
    private String numTel;

    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;
  
    @Column(name = "motdepasse")
    private String moteDePasse;

    @ManyToOne
    @JoinColumn(name = "entrepriseId")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;

    
}
