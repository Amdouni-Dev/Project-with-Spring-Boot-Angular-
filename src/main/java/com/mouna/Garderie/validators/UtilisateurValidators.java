package com.mouna.Garderie.validators;

import com.mouna.Garderie.dto.UtilisateurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidators {
    public static List<String> utilisateurValidators(UtilisateurDTO utilisateurDTO){
    List<String> errors=new ArrayList();

        if(utilisateurDTO == null ){

            errors.add("veuiller renseigner le nom d\'utilisateur");
            errors.add("veuiller renseigner le prenom d\'utilisateur");
            errors.add("veuiller renseigner l\'email d\'utilisateur");
            errors.add("veuiller renseigner l'adresse'd\'utilisateur");
            return errors;
        }

if(utilisateurDTO.getAdresse()== null){
    errors.add("veuillez reneugner k'adresse");
}
    if( !StringUtils.hasLength(utilisateurDTO.getNom())){
        errors.add("veuiller renseigner le nom d\'utilisateur");
    }

        if( !StringUtils.hasLength(utilisateurDTO.getPrenom())){
            errors.add("veuiller renseigner le prenom d\'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDTO.getEmail())){
            errors.add("veuiller renseigner l\'email d\'utilisateur");
        }
        if( !StringUtils.hasLength(utilisateurDTO.getMotDePass())){
            errors.add("veuiller renseigner le mot de passe d\'utilisateur");
        }
        if( !StringUtils.hasLength(utilisateurDTO.getAdresse().getAdresse1())){
            errors.add("veuiller renseigner l'adresse'd\'utilisateur");
        }

// Date
   if(utilisateurDTO.getDateNaissance()== null){
       errors.add("veuiller renseigner la date naissance'd\'utilisateur");


   }

    return errors;


    }
}
