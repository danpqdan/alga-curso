package com.cursoalga.cursoapialga.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cursoalga.cursoapialga.DTO.EntregaDTO;
import com.cursoalga.cursoapialga.DTO.input.EntregaInput;
import com.cursoalga.cursoapialga.domain.service.SolicitacaoEntregaService;
import com.cursoalga.cursoapialga.mapper.EntregaMapper;
import com.cursoalga.cursoapialga.model.Entrega;
import com.cursoalga.cursoapialga.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas")
public class EntregaController {

    private EntregaRepository entregaRepository;
    private SolicitacaoEntregaService solicitacaoEntregaService;
    private EntregaMapper entregaMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EntregaDTO solicitarEntrega(@Valid @RequestBody EntregaInput entregaInput) {
        Entrega novaEntrega = entregaMapper.toEntity(entregaInput);
        Entrega entregaSolicitada = solicitacaoEntregaService.solicitar(novaEntrega);
        return entregaMapper.toModel(entregaSolicitada);
    }

    @GetMapping
    public List<EntregaDTO> listar() {
        return entregaMapper.toCollectionDTO(entregaRepository.findAll());
    }

    @GetMapping("/{entregaId}")
    public ResponseEntity<EntregaDTO> buscas(@PathVariable Long entregaId) {
        return entregaRepository.findById(entregaId)
                .map(entrega -> ResponseEntity.ok(entregaMapper.toModel(entrega)))
                .orElse(ResponseEntity.notFound().build());
    }

}
