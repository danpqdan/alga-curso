package com.cursoalga.cursoapialga.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.cursoalga.cursoapialga.DTO.OcorrenciaDTO;
import com.cursoalga.cursoapialga.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class OcorrenciaMapper {

    ModelMapper modelmapper;

    public OcorrenciaDTO toModel(Ocorrencia ocorrencia) {
        return modelmapper.map(ocorrencia, OcorrenciaDTO.class);
    }

    public List<OcorrenciaDTO> toCollectionModel(List<Ocorrencia> ocorrencias) {
        return ocorrencias.stream().map(this::toModel).collect(Collectors.toList());
    }
}
