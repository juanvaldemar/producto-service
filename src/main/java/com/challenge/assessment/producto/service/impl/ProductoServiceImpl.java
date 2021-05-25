package com.challenge.assessment.producto.service.impl;

import com.challenge.assessment.producto.entity.Producto;
import com.challenge.assessment.producto.repository.ProductoServiceRepositoy;
import com.challenge.assessment.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoServiceRepositoy productoServiceRepositoy;

    @Override
    public Producto save(Producto producto) {
        return productoServiceRepositoy.save(producto);

    }

    @Override
    public List<Producto> findAll() {
        return productoServiceRepositoy.findAll();
    }

    @Override
    public void findDeleteAll() {
        productoServiceRepositoy.deleteAll();
    }

}
