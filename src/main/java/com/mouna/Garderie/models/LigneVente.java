package com.mouna.Garderie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class LigneVente extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "idVente")
    private Ventes vente;


    private BigDecimal quantite;


}
