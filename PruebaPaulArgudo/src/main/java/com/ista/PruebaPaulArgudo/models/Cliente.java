package com.ista.PruebaPaulArgudo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cliente")
@Data
@Getter
@Setter
public class Cliente {
    private Long id;
    private  String nombre;
    private String apellido;
    private String cedula;
    private String correo;
}
