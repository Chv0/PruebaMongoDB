package com.ista.PruebaPaulArgudo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Carta")
@Data
@Getter
@Setter
public class Carta {
    private Long id;
    private String categoria;
    private int cantidad;
    private Plato plato;
}
