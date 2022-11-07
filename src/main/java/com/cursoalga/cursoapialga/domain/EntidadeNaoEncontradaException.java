package com.cursoalga.cursoapialga.domain;

public class EntidadeNaoEncontradaException extends NegocioException {

    static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }

}
