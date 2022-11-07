package com.cursoalga.cursoapialga.DTO.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaInput {

    @NotBlank
    String descricao;

}
