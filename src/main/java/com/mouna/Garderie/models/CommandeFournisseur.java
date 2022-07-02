package com.mouna.Garderie.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class CommandeFournisseur  extends AbstractEntity{

    @Column(name="code")
    private String code;

    @Column(name = "dateCommand")
    private Instant dateCommande;

    @ManyToOne //fournissur whed 3andou plusieurs commandes
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseurs")
    private List<LigneCommandeFournisseur> ligneCommandesFournisseurs;


}
