package com.mouna.Garderie.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDTO {
    private Integer id;
    private String nom;
}
