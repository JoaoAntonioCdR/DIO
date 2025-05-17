package dio.projeto.SpringDataJpa.Service.Impl;

import dio.projeto.SpringDataJpa.Model.Aluno;
import dio.projeto.SpringDataJpa.Model.AvaliacaoFisica;
import dio.projeto.SpringDataJpa.Model.Form.AvaliacaoFisicaForm;
import dio.projeto.SpringDataJpa.Repository.AlunoRepository;
import dio.projeto.SpringDataJpa.Repository.AvaliacaoFisicaRepository;
import dio.projeto.SpringDataJpa.Service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;


    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setAltura(form.getAltura());
        avaliacaoFisica.setPeso(form.getPeso());

       return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica getAvaliacaoFisica(Long id) {
        return avaliacaoFisicaRepository.findById(id).get();
    }
}
