package com.challenge.assessment.producto.repository;

import com.challenge.assessment.producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductoServiceRepositoy extends JpaRepository<Producto,Integer> {



}
