package com.design_patterns.projeto_design_patterns.Services;

import com.design_patterns.projeto_design_patterns.Model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Iterable<Cliente> listarClientes();

    Cliente buscarClientePorId(Long id);

    void salvarCliente(Cliente cliente);

    void atualizarCliente(Long id, Cliente cliente);

    void excluirCliente(Long id);

    String buscarCidadePorClienteID(Long id);
}
