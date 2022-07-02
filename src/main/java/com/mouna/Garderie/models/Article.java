package com.mouna.Garderie.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true) // hedhy t3ayet l les methodes hashcode w w equals 9bal metehseb w par defaut c false
@Entity
@Table(name="Article") // nom fel bdd (c optionnelle sinon yekhou nom de classe)
public class Article extends AbstractEntity {
	
	@Column(name="codeArticle")
	private Integer codeArticle;
	
	@Column(name="designation")
	private String designation;

	@Column(name="prixUnitaireht")
	private BigDecimal prixUnitaireht;


	@Column(name="tauxTVA")
	private BigDecimal tauxTVA;


	@Column(name="prixUnitaireTTC")
	private BigDecimal prixUnitaireTTC;

	@Column(name="photo")
	private String photo;

	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;
	
	
}
