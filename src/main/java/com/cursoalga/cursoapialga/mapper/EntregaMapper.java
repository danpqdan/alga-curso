package com.cursoalga.cursoapialga.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.cursoalga.cursoapialga.DTO.EntregaDTO;
import com.cursoalga.cursoapialga.DTO.input.EntregaInput;
import com.cursoalga.cursoapialga.model.Entrega;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaMapper {

    private ModelMapper modelMapper;

    public EntregaDTO toModel(Entrega entrega) {
        return modelMapper.map(entrega, EntregaDTO.class);
    }

    public List<EntregaDTO> toCollectionDTO(List<Entrega> entregas) {
        return entregas.stream()
                .map(this::toModel).collect(Collectors.toList());
    }

    public Entrega toEntity(EntregaInput entregaInput) {
        return modelMapper.map(entregaInput, Entrega.class);
    }

}
