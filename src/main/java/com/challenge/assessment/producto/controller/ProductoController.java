package com.challenge.assessment.producto.controller;

import com.challenge.assessment.producto.entity.Producto;
import com.challenge.assessment.producto.service.impl.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1")
public class ProductoController {


    @Autowired
    private ProductoServiceImpl productoService;

    @RequestMapping(value = "/producto", method = RequestMethod.POST)
    public ResponseEntity<Producto> guardarProducto(@RequestBody Producto request){

        Producto producto = new Producto();

        producto = productoService.save(request);

        return new ResponseEntity<>(producto, HttpStatus.OK);

    }

    @RequestMapping(value = "/producto", method = RequestMethod.GET)
    public ResponseEntity<List<Producto>> guardarProducto(){

        List<Producto> productoList = new ArrayList<>();

        productoList = productoService.findAll();

        return new ResponseEntity<>(productoList, HttpStatus.OK);

    }











}
