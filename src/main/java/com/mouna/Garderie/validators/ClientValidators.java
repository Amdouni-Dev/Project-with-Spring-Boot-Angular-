package com.mouna.Garderie.validators;

import com.mouna.Garderie.dto.CategoryDTO;
import com.mouna.Garderie.dto.ClientDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidators {

    public static List<String> clientvalidator(ClientDTO clientDTO){

        List<String> errors =new ArrayList<>();


        if(clientDTO== null){
            errors.add("veuiller renseiggner le nom du client!");
            errors.add("veuiller renseiggner le prenom du client!");
            errors.add("veuiller renseiggner le mail du client!");
            errors.add("veuiller renseiggner le numero du client!");

            return errors;

        }

        // test 1
        // ken l categorie null w ila l code categoruie inexistant
        if(clientDTO == null || !StringUtils.hasLength(clientDTO.getNom())){
            errors.add("veuiller renseiggner le nom du client!");
        }

        if(clientDTO == null || !StringUtils.hasLength(clientDTO.getPrenom())){
            errors.add("veuiller renseiggner le prenom du client!");
        }


        if(clientDTO == null || !StringUtils.hasLength(clientDTO.getMail())){
            errors.add("veuiller renseiggner le mail du client!");
        }

        if(clientDTO == null || !StringUtils.hasLength(clientDTO.getNumTel())){
            errors.add("veuiller renseiggner le numero du client!");
        }


        return errors;
    }

}
