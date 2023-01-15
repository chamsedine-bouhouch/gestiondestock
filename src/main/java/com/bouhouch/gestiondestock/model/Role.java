package com.bouhouch.gestiondestock.model;
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
@Table(name = "role")
public class Role extends AbstractEntity{
 
    @Column(name = "roleName")
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "utilisateurId")
    private Utilisateur utilisateur;

}
