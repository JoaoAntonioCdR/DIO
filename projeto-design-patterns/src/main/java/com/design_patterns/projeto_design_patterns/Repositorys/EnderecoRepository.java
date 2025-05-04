package com.design_patterns.projeto_design_patterns.Repositorys;

import com.design_patterns.projeto_design_patterns.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
