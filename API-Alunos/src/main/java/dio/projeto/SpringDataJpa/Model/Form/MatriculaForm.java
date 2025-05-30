package dio.projeto.SpringDataJpa.Model.Form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O ID do aluno precisa ser positivo")
    private long alunoId;
}
