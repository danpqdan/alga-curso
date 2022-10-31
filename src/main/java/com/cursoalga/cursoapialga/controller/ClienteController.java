package com.cursoalga.cursoapialga.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoalga.cursoapialga.model.Cliente;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Daniel");
        cliente1.setEmail("@Daniel123");
        cliente1.setTelefone("123456789");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("maria");
        cliente2.setEmail("@maria123");
        cliente2.setTelefone("89898989");

        return Arrays.asList(cliente1, cliente2);
    }
}
