package com.cursoalga.cursoapialga.DTO.input;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteIdInput {

    @NotNull
    Long id;

}
