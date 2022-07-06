package com.mouna.Garderie.validators;

import com.mouna.Garderie.dto.ClientDTO;
import com.mouna.Garderie.dto.FournisseurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {


    public static List<String> fournisseurvalidator(FournisseurDTO fournisseurDTO){

        List<String> errors =new ArrayList<>();


        if(fournisseurDTO== null){
            errors.add("veuiller renseiggner le nom du fournisseur!");
            errors.add("veuiller renseiggner le prenom du fournisseur!");
            errors.add("veuiller renseiggner le mail du fournisseur!");
            errors.add("veuiller renseiggner le numero du fournisseur!");

            return errors;

        }

        // test 1
        // ken l categorie null w ila l code categoruie inexistant
        if(fournisseurDTO == null || !StringUtils.hasLength(fournisseurDTO.getNom())){
            errors.add("veuiller renseiggner le nom du fournisseur!");
        }

        if(fournisseurDTO == null || !StringUtils.hasLength(fournisseurDTO.getPrenom())){
            errors.add("veuiller renseiggner le prenom du fournisseur!");
        }


        if(fournisseurDTO == null || !StringUtils.hasLength(fournisseurDTO.getMail())){
            errors.add("veuiller renseiggner le mail du fournisseur!");
        }

        if(fournisseurDTO == null || !StringUtils.hasLength(fournisseurDTO.getNumTel())){
            errors.add("veuiller renseiggner le numero du fournisseur!");
        }


        return errors;
    }


}
