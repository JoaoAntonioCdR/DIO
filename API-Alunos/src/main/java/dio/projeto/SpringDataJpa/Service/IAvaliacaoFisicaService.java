package dio.projeto.SpringDataJpa.Service;

import dio.projeto.SpringDataJpa.Model.AvaliacaoFisica;
import dio.projeto.SpringDataJpa.Model.Form.AvaliacaoFisicaForm;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm avaliacaoFisica);

    AvaliacaoFisica getAvaliacaoFisica(Long id);
}
