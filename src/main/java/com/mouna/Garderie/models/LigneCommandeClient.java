package com.mouna.Garderie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class LigneCommandeClient extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idCommandClient")
    private CommandeClient commandeClient;


}
