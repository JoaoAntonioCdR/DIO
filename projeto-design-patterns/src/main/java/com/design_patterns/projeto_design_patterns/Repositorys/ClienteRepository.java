package com.design_patterns.projeto_design_patterns.Repositorys;

import com.design_patterns.projeto_design_patterns.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Optional<Cliente> findById(Long id);

    void deleteById(Long id);
}
