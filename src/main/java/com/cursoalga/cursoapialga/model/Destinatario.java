package com.cursoalga.cursoapialga.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Destinatario {

    @Column(name = "destinatario_nome")
    @NotBlank
    String nome;
    @Column(name = "destinatario_logradouro")
    @NotBlank
    String logradouro;
    @Column(name = "destinatario_numero")
    @NotBlank
    String numero;
    @Column(name = "destinatario_complemento")
    @NotBlank
    String complemento;
    @NotBlank
    @Column(name = "destinatario_bairro")
    String bairro;

}
