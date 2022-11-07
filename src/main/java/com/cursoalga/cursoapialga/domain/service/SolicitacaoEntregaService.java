package com.cursoalga.cursoapialga.domain.service;

import java.time.OffsetDateTime;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cursoalga.cursoapialga.model.Cliente;
import com.cursoalga.cursoapialga.model.Entrega;
import com.cursoalga.cursoapialga.model.StatusEntrega;
import com.cursoalga.cursoapialga.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SolicitacaoEntregaService {

    private CatalogoClienteService catalogoClienteService;
    private EntregaRepository entregaRepository;

    @Transactional
    public Entrega solicitar(Entrega entrega) {
        Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());

        entrega.setCliente(cliente);
        entrega.setStatus(StatusEntrega.PENDENTE);
        entrega.setDataPedido(OffsetDateTime.now());

        return entregaRepository.save(entrega);
    }

}
