package com.mouna.Garderie.validators;

import com.mouna.Garderie.dto.ArticleDTO;
import com.mouna.Garderie.dto.UtilisateurDTO;
import com.mouna.Garderie.models.Article;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidators {


    public static List<String> articleValidators(ArticleDTO articleDTO) {
        List<String> errors = new ArrayList();

        if(articleDTO == null){
            errors.add("veuiller renseigner le code article");
            errors.add("veuiller renseigner la designation  article");
            errors.add("veuiller renseigner le champs 'prix ht' ");
            errors.add("veuiller renseigner le champs 'prix TTC' ");
            errors.add("veuiller selectionner une ca*tegorie");
            return errors;
        }

        if( !StringUtils.hasLength(articleDTO.getCodeArticle().toString())){
            errors.add("veuiller renseigner le code article");
        }

        if( !StringUtils.hasLength(articleDTO.getDesignation())){
            errors.add("veuiller renseigner la designation  article");
        }

        if(articleDTO.getPrixUnitaireht() == null){

            errors.add("veuiller renseigner le champs 'prix ht' ");

        }
        if(articleDTO.getPrixUnitaireTTC() == null){

            errors.add("veuiller renseigner le champs 'prix TTC' ");

        }
     if(articleDTO.getCategory() == null){
         errors.add("veuiller selectionner une ca*tegorie");
     }





        return errors;
    }
}
