package dio.projeto.SpringDataJpa.Controller;

import dio.projeto.SpringDataJpa.Model.AvaliacaoFisica;
import dio.projeto.SpringDataJpa.Model.Form.AvaliacaoFisicaForm;
import dio.projeto.SpringDataJpa.Service.Impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return avaliacaoFisicaService.create(form);
    }
}
