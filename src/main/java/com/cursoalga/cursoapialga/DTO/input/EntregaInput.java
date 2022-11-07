package com.cursoalga.cursoapialga.DTO.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {

    @Valid
    @NotNull
    ClienteIdInput cliete;

    @Valid
    @NotNull
    DestinatarioInput destinatario;

    @NotNull
    BigDecimal taxa;

}
