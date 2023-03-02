package com.ista.PruebaPaulArgudo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Restaurante")
@Data
@Getter
@Setter
public class Restaurante {
    private Long id;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private Cliente cliente;

    private Carta carta;
    private List <Carta> cartas;

}
