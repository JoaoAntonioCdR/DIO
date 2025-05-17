package dio.projeto.SpringDataJpa.Service.Impl;

import dio.projeto.SpringDataJpa.Model.Aluno;
import dio.projeto.SpringDataJpa.Model.AvaliacaoFisica;
import dio.projeto.SpringDataJpa.Model.Form.AlunoForm;
import dio.projeto.SpringDataJpa.Repository.AlunoRepository;
import dio.projeto.SpringDataJpa.Service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno createAluno(AlunoForm aluno) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome(aluno.getNome());
        aluno1.setCpf(aluno.getCpf());
        aluno1.setBairro(aluno.getBairro());
        aluno1.setDataDeNascimento(aluno.getDataDeNascimento());
        return alunoRepository.save(aluno1);
    }

    @Override
    public Aluno findbyId(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public List<Aluno> findAll(String bairro) {
        if(bairro == null){
            return alunoRepository.findAll();
        } else {
            return alunoRepository.findAlunosByBairro(bairro);
        }
    }

    @Override
    public void updateAluno(Aluno aluno) {
        if (alunoRepository.findById(aluno.getId()) != null) {
            alunoRepository.save(aluno);
        }
    }

    @Override
    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisica> findAllAvaliacoesById(Long id) {
        return alunoRepository.findById(id).get().getAvaliacoes();
    }
}
