package com.cursoalga.cursoapialga.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {

    @Column(name = "destinatario_nome")
    String nome;
    @Column(name = "destinatario_logradouro")
    String logradouro;
    @Column(name = "destinatario_numero")
    String numero;
    @Column(name = "destinatario_complemento")
    String complemento;
    @Column(name = "destinatario_bairro")
    String bairro;

}
