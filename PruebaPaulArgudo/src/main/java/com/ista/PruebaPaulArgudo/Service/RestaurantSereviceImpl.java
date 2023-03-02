package com.ista.PruebaPaulArgudo.Service;

import com.ista.PruebaPaulArgudo.models.Restaurante;
import com.ista.PruebaPaulArgudo.repository.restaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestaurantSereviceImpl extends GenericServiceImpl<Restaurante, Long> implements RestaurantService{

    @Autowired
    private restaurantRepository restaurant;

    @Override
    public CrudRepository<Restaurante, Long> getDao(){
        return restaurant;
    }


}
