package dio.projeto.SpringDataJpa.Controller;

import dio.projeto.SpringDataJpa.Model.Aluno;
import dio.projeto.SpringDataJpa.Model.Form.AlunoForm;
import dio.projeto.SpringDataJpa.Service.Impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @GetMapping()
    public List<Aluno> getAllAlunos(@RequestParam(value = "bairro", required = false) String bairro){
        return alunoService.findAll(bairro);
    }

    @PostMapping()
    public Aluno createAluno(@Valid @RequestBody AlunoForm aluno){
        return alunoService.createAluno(aluno);
    }
}
