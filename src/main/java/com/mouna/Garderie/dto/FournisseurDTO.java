package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Adresse;
import com.mouna.Garderie.models.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class FournisseurDTO {
    private Integer id;
    private String nom;


    private String prenom;

    private Adresse adresse;


    private String mail;

    private String numTel;


    private List<CommandeFournisseurDTO> commandFournisseurs;
}
