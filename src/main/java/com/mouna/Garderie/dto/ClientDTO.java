package com.mouna.Garderie.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mouna.Garderie.models.Adresse;
import com.mouna.Garderie.models.Client;
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



    public static ClientDTO fromEntityCategory(Client client){
        if(client == null){
            return null;
        }
        // Mapping de CategoryDTO vers Category
        return ClientDTO.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .build();
    }


    // taw l3aks ==> mel category vers CategoryDTO
    public Client toEntity(ClientDTO clientDTO){
        if(clientDTO == null){
            return null;
        }
        Client client=new Client();
client.setId(clientDTO.getId());
client.setNom(clientDTO.getNom());
client.setPrenom(clientDTO.getPrenom());
        return client;



    }


}
