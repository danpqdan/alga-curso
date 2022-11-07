package com.cursoalga.cursoapialga.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cursoalga.cursoapialga.model.Entrega;
import com.cursoalga.cursoapialga.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FinalizacaoEntregaService {

    EntregaRepository entregaRepository;
    BuscaEntregaService buscaEntregaService;

    @Transactional
    public void finalizar(Long clienteId) {
        Entrega entrega = buscaEntregaService.buscar(clienteId);
        entrega.finalizar();
        entregaRepository.save(entrega);
    }

}
