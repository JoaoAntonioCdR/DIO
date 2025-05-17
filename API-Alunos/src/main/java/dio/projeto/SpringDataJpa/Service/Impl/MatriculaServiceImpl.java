package dio.projeto.SpringDataJpa.Service.Impl;

import dio.projeto.SpringDataJpa.Model.Aluno;
import dio.projeto.SpringDataJpa.Model.Form.MatriculaForm;
import dio.projeto.SpringDataJpa.Model.Matricula;
import dio.projeto.SpringDataJpa.Repository.MatriculaRepository;
import dio.projeto.SpringDataJpa.Service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoServiceImpl alunoRepository;


    @Override
    public Matricula createMatricula(MatriculaForm matricula) {
        Matricula novaMatricula = new Matricula();
        Aluno aluno = alunoRepository.findbyId(matricula.getAlunoId());

        novaMatricula.setAluno(aluno);
        matriculaRepository.save(novaMatricula);
        return novaMatricula;
    }

    @Override
    public List<Matricula> getAllMatriculas() {
        return matriculaRepository.findAll();
    }

    @Override
    public void deleteMatricula(Long id) {
        matriculaRepository.deleteById(id);
    }
}
