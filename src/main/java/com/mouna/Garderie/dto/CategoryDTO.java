package com.mouna.Garderie.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mouna.Garderie.models.Article;
import com.mouna.Garderie.models.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Data // hedhy t3awedh les methiodes predefinies lkol
@Builder
public class CategoryDTO {
    private Integer id;
    private String code;

    private String designation;

    //Mapping avec category
    @JsonIgnore
    private List<ArticleDTO> articles;

    // Mapping entre Category et CategoryDTO
// construire une DTO a partir d'une entité
    public CategoryDTO fromEntityCategory(Category category){
        if(category == null){
            return null;
        }
        // Mapping de CategoryDTO vers Category
        return CategoryDTO.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }


    // taw l3aks ==> mel category vers CategoryDTO
    public Category toEntity(CategoryDTO categoryDTO){
        if(categoryDTO == null){
            return null;
        }
       Category category=new Category();
        category.setId(categoryDTO.getId());
        category.setDesignation(category.getDesignation());
        category.setCode(category.getCode());
        return category;



    }


}
