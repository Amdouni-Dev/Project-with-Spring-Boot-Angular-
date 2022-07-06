package com.mouna.Garderie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data // hedhy t3awedh les methiodes predefinies lkol

@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="Category") // nom fel bdd (c optionnelle sinon yekhou nom de classe)

public class Category extends AbstractEntity {



    @Column(name="codeCategory")
    private String code;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;

}
