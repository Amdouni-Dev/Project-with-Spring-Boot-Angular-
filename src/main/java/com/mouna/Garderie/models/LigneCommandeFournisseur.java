package com.mouna.Garderie.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity

public class LigneCommandeFournisseur extends AbstractEntity {

    @ManyToOne //plusieurs articles mawjoudin f ligne de commande wahda
    @JoinColumn(name="idArticle")
    private Article article;

    //houni 3andi plusieurs commande fournisseurs mawjoudin f ligne de commande ==> donc lezemni njib l id mte3 commande fournisseur
    @ManyToOne
    @JoinColumn(name="commandeFournisseurs")
    private CommandeFournisseur commandeFournisseurs;


}
