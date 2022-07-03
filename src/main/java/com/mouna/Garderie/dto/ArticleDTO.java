package com.mouna.Garderie.dto;


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

}
