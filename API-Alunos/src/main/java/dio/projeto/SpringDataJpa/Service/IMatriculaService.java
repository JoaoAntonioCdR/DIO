package dio.projeto.SpringDataJpa.Service;

import dio.projeto.SpringDataJpa.Model.Form.MatriculaForm;
import dio.projeto.SpringDataJpa.Model.Matricula;

import java.util.List;

public interface IMatriculaService {

    Matricula createMatricula(MatriculaForm matricula);

    List<Matricula> getAllMatriculas();

    void deleteMatricula(Long id);
}
