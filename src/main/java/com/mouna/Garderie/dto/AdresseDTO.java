package com.mouna.Garderie.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
@Data
@Builder
public class AdresseDTO {
    private Integer id;


    private String adresse1;


    private String adresse2;


    private String ville;


    private String codePostal;


    private String pays;
}
