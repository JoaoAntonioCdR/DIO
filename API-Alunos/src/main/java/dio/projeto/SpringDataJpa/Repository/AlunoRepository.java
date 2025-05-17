package dio.projeto.SpringDataJpa.Repository;

import dio.projeto.SpringDataJpa.Model.Aluno;
import dio.projeto.SpringDataJpa.Model.Form.AlunoForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno save(AlunoForm aluno);

    List<Aluno> findByNome(String nome);

    List<Aluno> findAlunosByCpf(String cpf);

    List<Aluno> findAlunosByBairro(String bairro);
}
