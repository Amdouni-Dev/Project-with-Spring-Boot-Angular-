package com.mouna.Garderie.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data // haja generique le getters w setters w hashcode  w w w 
@MappedSuperclass // class general
@EntityListeners(AuditingEntityListener.class) // hedhy ki tsir update l date direct tsir enregistrement
public class AbstractEntity  implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	// houni nahki aal date de creation de l'entité
	@CreatedDate
	@Column(name="createdDate" , nullable=false)
	@JsonIgnore
	private Instant createdDate; 
	
	@LastModifiedDate
	@Column(name="lastModifiedDate" )
	@JsonIgnore
	private Instant lastModifiedDate; 
	
	
	

}
