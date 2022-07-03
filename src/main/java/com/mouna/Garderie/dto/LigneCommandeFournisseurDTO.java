package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Article;
import com.mouna.Garderie.models.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
public class LigneCommandeFournisseurDTO {
    private Integer id;
    private ArticleDTO article;

    //houni 3andi plusieurs commande fournisseurs mawjoudin f ligne de commande ==> donc lezemni njib l id mte3 commande fournisseur
   private CommandeFournisseurDTO commandeFournisseurs;


}
