package com.mouna.Garderie.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Utilisateur extends AbstractEntity {
    @Column(name="nom")
    private String nom;


}
