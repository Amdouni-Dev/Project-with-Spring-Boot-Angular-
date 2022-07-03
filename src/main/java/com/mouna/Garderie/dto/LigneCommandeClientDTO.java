package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Article;
import com.mouna.Garderie.models.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
public class LigneCommandeClientDTO {
    private Integer id;
    private ArticleDTO article;


    private CommandeClientDTO commandeClient;


}
