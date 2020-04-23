package com.example.Proyecto8.dao;

import com.example.Proyecto8.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiDaoInterProducto extends JpaRepository<Producto,Integer> {
}
