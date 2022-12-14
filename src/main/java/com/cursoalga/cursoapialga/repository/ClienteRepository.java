package com.cursoalga.cursoapialga.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursoalga.cursoapialga.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // List<Cliente> findByNome(String nome);

    // List<Cliente> findByContaining(String nome);

    Optional<Cliente> findByEmail(String email);

}