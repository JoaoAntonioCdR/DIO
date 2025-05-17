package dio.projeto.SpringDataJpa.Repository;

import dio.projeto.SpringDataJpa.Model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
