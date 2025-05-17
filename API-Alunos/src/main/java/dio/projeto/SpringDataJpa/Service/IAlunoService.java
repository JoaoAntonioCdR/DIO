package dio.projeto.SpringDataJpa.Service;

import dio.projeto.SpringDataJpa.Model.Aluno;
import dio.projeto.SpringDataJpa.Model.AvaliacaoFisica;
import dio.projeto.SpringDataJpa.Model.Form.AlunoForm;
import dio.projeto.SpringDataJpa.Model.Matricula;

import java.util.List;

public interface IAlunoService {

    Aluno createAluno(AlunoForm aluno);

    Aluno findbyId(Long id);

    List<Aluno> findAll(String cpf);

    void updateAluno(Aluno aluno);

    void deleteAluno(Long id);

    List<AvaliacaoFisica> findAllAvaliacoesById(Long id);

}
