package com.cursoalga.cursoapialga.exceptionhandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class Problema {
    Integer status;
    OffsetDateTime dataHota;
    String titulo;
    List<Campos> campo;

    @AllArgsConstructor
    @Getter
    public static class Campos {

        String nome;
        String mensagem;
    }

}
