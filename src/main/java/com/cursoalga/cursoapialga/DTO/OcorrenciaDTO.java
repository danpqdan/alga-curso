package com.cursoalga.cursoapialga.DTO;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaDTO {
    Long id;
    String descricao;
    OffsetDateTime dataRegistro;
}
