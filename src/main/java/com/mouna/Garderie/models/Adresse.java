package com.mouna.Garderie.models;

import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.Column;
import javax.persistence.Embeddable;
// behy concernant l'adresse donc l client aandou adresse
// w l'entreprise aandha adresse
// w fournisseur aanou adresse
/////      ==>>>>>> donc f 3oudh bech kol wehed naa3mleou adresse wahdou
// na3mel l classe hedhy lihom lkol
@Data

@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class Adresse {
    @Column(name="adresse1")
    private String adresse1;

    @Column(name="adresse2")
    private String adresse2;

    @Column(name="ville")
    private String ville;

    @Column(name="codePostal")
    private String codePostal;

    @Column(name="pays")
    private String pays;





}
