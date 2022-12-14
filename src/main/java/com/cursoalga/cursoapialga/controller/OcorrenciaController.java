package com.cursoalga.cursoapialga.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cursoalga.cursoapialga.DTO.OcorrenciaDTO;
import com.cursoalga.cursoapialga.DTO.input.OcorrenciaInput;
import com.cursoalga.cursoapialga.domain.service.BuscaEntregaService;
import com.cursoalga.cursoapialga.domain.service.RegistroOcorrenciaService;
import com.cursoalga.cursoapialga.mapper.OcorrenciaMapper;
import com.cursoalga.cursoapialga.model.Entrega;
import com.cursoalga.cursoapialga.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {

    BuscaEntregaService buscaEntregaService;
    RegistroOcorrenciaService registroOcorrenciaService;
    OcorrenciaMapper ocorrenciaMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OcorrenciaDTO registrar(@PathVariable Long entregaId,
            @Valid @RequestBody OcorrenciaInput ocorrenciaInput) {

        Ocorrencia ocorrenciaRegistrada = registroOcorrenciaService.registrar(entregaId,
                ocorrenciaInput.getDescricao());

        return ocorrenciaMapper.toModel(ocorrenciaRegistrada);
    }

    @GetMapping
    public List<OcorrenciaDTO> listar(@PathVariable Long entregaId) {
        Entrega entrega = buscaEntregaService.buscar(entregaId);

        return ocorrenciaMapper.toCollectionModel(entrega.getOcorrencias());
    }

}
