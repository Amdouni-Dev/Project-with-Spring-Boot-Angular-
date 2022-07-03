package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Fournisseur;
import com.mouna.Garderie.models.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDTO {
    private Integer id;
    private String code;


    private Instant dateCommande;


    private FournisseurDTO fournisseur;

    private List<LigneCommandeFournisseurDTO> ligneCommandesFournisseurs;


}
