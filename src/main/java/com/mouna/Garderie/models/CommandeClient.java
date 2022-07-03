package com.mouna.Garderie.models;

import javax.crypto.Cipher;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity

public class CommandeClient extends AbstractEntity {
    @Column(name="codeCommandeClient")
    private Integer codeArticle;
    @Column(name="dateCommande")
private Instant dateCommande;

@ManyToOne
@JoinColumn(name = "idClient")
private Client client;


@OneToMany(mappedBy = "commandeClient")
private List<LigneCommandeClient> ligneCommandeClient;



}
