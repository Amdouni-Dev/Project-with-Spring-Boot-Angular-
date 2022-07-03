package com.mouna.Garderie.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class EntrepriseDTO {
    private Integer id;
    private Integer codeArticle;


    private String designation;
}
