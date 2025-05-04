package com.design_patterns.projeto_design_patterns.Services.Impl;

import com.design_patterns.projeto_design_patterns.Model.Cliente;
import com.design_patterns.projeto_design_patterns.Model.Endereco;
import com.design_patterns.projeto_design_patterns.Repositorys.ClienteRepository;
import com.design_patterns.projeto_design_patterns.Repositorys.EnderecoRepository;
import com.design_patterns.projeto_design_patterns.Services.ClienteService;
import com.design_patterns.projeto_design_patterns.Services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
    @Override
    public Cliente buscarClientePorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public String buscarCidadePorClienteID(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get().getEnderecos().getLocalidade();
    }

    @Override
    public void salvarCliente(Cliente cliente) {
       salvarClienteComCep(cliente);
    }

    @Override
    public void atualizarCliente(Long id, Cliente cliente) {
        Optional<Cliente> clienteBD = clienteRepository.findById(id);
        if (clienteBD.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEnderecos().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEnderecos(endereco);
        clienteRepository.save(cliente);
    }
}
