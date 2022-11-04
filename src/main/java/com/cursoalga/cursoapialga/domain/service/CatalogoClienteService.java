package com.cursoalga.cursoapialga.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursoalga.cursoapialga.domain.NegocioException;
import com.cursoalga.cursoapialga.model.Cliente;
import com.cursoalga.cursoapialga.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CatalogoClienteService {

    ClienteRepository clienteRepository;

    public Cliente buscar(Long clienteId) {
        return clienteRepository.findById(clienteId)
                .orElseThrow(() -> new NegocioException("Cliente não encontrado"));
    }

    @Transactional
    public Cliente salvar(Cliente cliente) {
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
                .stream()
                .anyMatch(clienteExistente -> !clienteExistente.equals(cliente));
        if (emailEmUso) {
            throw new NegocioException("Ja existe um cliente cadastrado com esse e-mail");
        }
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long clienteId) {
        clienteRepository.deleteById(clienteId);
    }

}
