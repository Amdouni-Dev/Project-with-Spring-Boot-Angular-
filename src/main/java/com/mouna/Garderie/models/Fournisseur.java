package com.mouna.Garderie.models;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Fournisseur extends AbstractEntity {
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded // yaani champs hedha raw composé ==>bech nesta3mlou f plusieurs entités
    private Adresse adresse;

    @Column(name="mail")
    private String mail;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandFournisseurs;
}
