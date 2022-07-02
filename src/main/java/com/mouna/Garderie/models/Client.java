package com.mouna.Garderie.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true) // hedhy t3ayet l les methodes hashcode w w equals 9bal metehseb w par defaut c false
@Entity


public class Client extends AbstractEntity {


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

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandes;

}
