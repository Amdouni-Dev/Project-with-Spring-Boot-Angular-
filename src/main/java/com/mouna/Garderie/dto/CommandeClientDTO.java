package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Client;
import com.mouna.Garderie.models.LigneCommandeClient;
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
public class CommandeClientDTO   {
    private Integer id;
    private Integer codeArticle;

    private Instant dateCommande;


    private Client client;


    private List<LigneCommandeClientDTO> ligneCommandeClient;


}
