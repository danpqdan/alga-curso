package com.cursoalga.cursoapialga.DTO;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.cursoalga.cursoapialga.model.ClienteResumoModel;
import com.cursoalga.cursoapialga.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaDTO {

    Long id;
    ClienteResumoModel cliente;
    DestinatarioModelDTO destinatario;
    BigDecimal taxa;
    StatusEntrega statusEntrega;
    OffsetDateTime dataPedido;
    OffsetDateTime dataFinalizacao;

}
