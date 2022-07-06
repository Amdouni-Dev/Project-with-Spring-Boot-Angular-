package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Adresse;
import com.mouna.Garderie.models.Category;
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

    public static AdresseDTO fromEntityCategory(Adresse adresse){
        if(adresse == null){
            return null;
        }
        // Mapping de CategoryDTO vers Category
        return AdresseDTO.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostal(adresse.getCodePostal())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }


    // taw l3aks ==> mel category vers CategoryDTO
    public Adresse toEntity(AdresseDTO adresseDTO){
        if(adresseDTO == null){
            return null;
        }
        Adresse adresse=new Adresse();
        adresse.setAdresse1(adresseDTO.getAdresse1());
        adresse.setAdresse2(adresseDTO.getAdresse2());
        adresse.setCodePostal(adresseDTO.getCodePostal());
        adresse.setVille(adresseDTO.getVille());
        adresse.setPays(adresseDTO.getPays());
        return adresse;



    }
}
