package com.mouna.Garderie.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Entreprise extends AbstractEntity {
    @Column(name="codeEntreprise")
    private Integer codeArticle;

    @Column(name="designation")
    private String designation;
}
