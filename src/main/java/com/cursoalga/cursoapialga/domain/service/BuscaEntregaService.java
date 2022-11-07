package com.cursoalga.cursoapialga.domain.service;

import org.springframework.stereotype.Service;

import com.cursoalga.cursoapialga.domain.EntidadeNaoEncontradaException;
import com.cursoalga.cursoapialga.model.Entrega;
import com.cursoalga.cursoapialga.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

    EntregaRepository entregaRepository;

    public Entrega buscar(Long entregaId) {
        return entregaRepository.findById(entregaId)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("entrega não encontrada"));
    }
}
