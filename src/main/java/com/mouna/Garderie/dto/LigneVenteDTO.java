package com.mouna.Garderie.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDTO {
    private Integer id;
    private VentesDTO vente;


    private BigDecimal quantite;
}
