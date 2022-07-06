package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Roles;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDTO {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePass;
    private AdresseDTO adresse;
    private String photo;
    private EntrepriseDTO entreprise;
    private List<RolesDTO> roles;
    private Instant dateNaissance;

}
