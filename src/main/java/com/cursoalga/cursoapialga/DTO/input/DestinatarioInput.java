package com.cursoalga.cursoapialga.DTO.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DestinatarioInput {

    @NotBlank
    String nome;
    @NotBlank
    String logradouro;
    @NotBlank
    String numero;
    @NotBlank
    String complemento;
    @NotBlank
    String bairro;
}
