package com.ista.PruebaPaulArgudo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Plato")
@Data
@Getter
@Setter
public class Plato {
    private Long id;
    private String nombrePlato;
    private String descripcion;
    private double precio;
}
