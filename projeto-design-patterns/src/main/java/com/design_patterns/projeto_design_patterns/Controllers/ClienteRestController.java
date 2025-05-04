package com.design_patterns.projeto_design_patterns.Controllers;

import com.design_patterns.projeto_design_patterns.Model.Cliente;
import com.design_patterns.projeto_design_patterns.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<Iterable<Cliente>> listarClientes(){
        return ResponseEntity.ok(clienteService.listarClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(clienteService.buscarClientePorId(id));
    }

    @PostMapping()
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente){
        clienteService.salvarCliente(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id,@RequestBody Cliente cliente){
        clienteService.atualizarCliente(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping
    public ResponseEntity<Void> removerCliente(@RequestBody Long id){
        clienteService.excluirCliente(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/cidade/{id}")
    public ResponseEntity<String> buscarCidadePorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(clienteService.buscarCidadePorClienteID(id));
    }
}
