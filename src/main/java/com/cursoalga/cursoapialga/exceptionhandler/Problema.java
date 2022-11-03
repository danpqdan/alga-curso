package com.cursoalga.cursoapialga.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {
    Integer status;
    LocalDateTime dataHota;
    String titulo;
    List<Campos> campo;

    @AllArgsConstructor
    @Getter
    public static class Campos {

        String nome;
        String mensagem;
    }

}
