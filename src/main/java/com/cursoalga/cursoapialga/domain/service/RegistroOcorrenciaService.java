package com.cursoalga.cursoapialga.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cursoalga.cursoapialga.domain.NegocioException;
import com.cursoalga.cursoapialga.model.Entrega;
import com.cursoalga.cursoapialga.model.Ocorrencia;
import com.cursoalga.cursoapialga.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {

    BuscaEntregaService buscaEntregaService;

    @Transactional
    public Ocorrencia registrar(Long entregaId, String descricao) {
        Entrega entrega = buscaEntregaService.buscar(entregaId);
        return entrega.adicionarOcorrencia(descricao);
    }

}
