package com.challenge.assessment.producto.service;

import com.challenge.assessment.producto.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

    Producto save(Producto cliente);
    List<Producto> findAll();
    void findDeleteAll();

}
