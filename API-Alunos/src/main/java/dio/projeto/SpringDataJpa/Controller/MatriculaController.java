package dio.projeto.SpringDataJpa.Controller;

import dio.projeto.SpringDataJpa.Model.Form.MatriculaForm;
import dio.projeto.SpringDataJpa.Model.Matricula;
import dio.projeto.SpringDataJpa.Service.Impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl matriculaService;

    @PostMapping("/{id}")
    public Matricula createMatricula(@Valid @RequestBody MatriculaForm form)  {
        return matriculaService.createMatricula(form);
    }

    @GetMapping()
    public List<Matricula> getAllMatriculas() {
        return matriculaService.getAllMatriculas();
    }
}
