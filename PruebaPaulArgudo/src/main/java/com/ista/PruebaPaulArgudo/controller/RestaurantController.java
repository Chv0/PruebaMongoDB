package com.ista.PruebaPaulArgudo.controller;

import com.ista.PruebaPaulArgudo.Service.RestaurantService;
import com.ista.PruebaPaulArgudo.models.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurante")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listarProductos() {
        return new ResponseEntity<>(restaurantService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crearProducto(
            @RequestBody Restaurante p) {
        return new ResponseEntity<>(restaurantService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizarProducto(@PathVariable Long id, @RequestBody Restaurante p) {
        Restaurante resta = restaurantService.findById(id);
        if (resta == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                resta.setNombre(p.getNombre());
                resta.setDireccion(p.getDireccion());
                resta.setCorreo(p.getCorreo());
                resta.setTelefono(p.getTelefono());

                return new ResponseEntity<>(restaurantService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminarProducto(@PathVariable Long id) {
        restaurantService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
