package com.cursoalga.cursoapialga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoalga.cursoapialga.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>{
    
}
