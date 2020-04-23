package com.example.Proyecto8.dao;

import com.example.Proyecto8.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiDaoInterCliente extends JpaRepository<Cliente,Integer>{

}
