package com.mouna.Garderie.validators;

import com.mouna.Garderie.dto.CategoryDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {


    public static List<String> validate(CategoryDTO categoryDTO){

        List<String> errors =new ArrayList<>();

        // test 1
        // ken l categorie null w ila l code categoruie inexistant
        if(categoryDTO == null || !StringUtils.hasLength(categoryDTO.getCode().toString())){
            errors.add("veuiller renseiggner le code de la categorie!");
        }
        return errors;
    }




}
