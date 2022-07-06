package com.mouna.Garderie.dto;


import com.mouna.Garderie.models.Adresse;
import com.mouna.Garderie.models.Article;
import com.mouna.Garderie.models.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Builder
public class ArticleDTO {
    private Integer id;

    private Integer codeArticle;


    private String designation;


    private BigDecimal prixUnitaireht;



    private BigDecimal tauxTVA;


    private BigDecimal prixUnitaireTTC;

    private String photo;


    private CategoryDTO category;



    public static ArticleDTO fromEntityCategory(Article article){
        if(article == null){
            return null;
        }
        // Mapping de CategoryDTO vers Category
        return ArticleDTO.builder()
                .id(article.getId())
                .designation(article.getDesignation())
                .prixUnitaireht(article.getPrixUnitaireht())
                .tauxTVA(article.getTauxTVA())
                .build();
    }


    // taw l3aks ==> mel category vers CategoryDTO
    public Article toEntity(ArticleDTO articleDTO){
        if(articleDTO == null){
            return null;
        }
        Article article=new Article();
        article.setId(articleDTO.getId());
       article.setDesignation(articleDTO.getDesignation());
       article.setPrixUnitaireht(articleDTO.getPrixUnitaireht());
       article.setPrixUnitaireTTC(articleDTO.getPrixUnitaireTTC());
       article.setTauxTVA(articleDTO.getTauxTVA());
        return article;



    }

    


}
