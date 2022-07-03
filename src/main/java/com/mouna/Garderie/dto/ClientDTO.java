package com.mouna.Garderie.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mouna.Garderie.models.Adresse;
import com.mouna.Garderie.models.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class ClientDTO {
    private Integer id;
    private String nom;


    private String prenom;


    private AdresseDTO adresse;


    private String mail;


    private String numTel;

    @JsonIgnore
    private List<LigneCommandeClientDTO> commandes;

}
