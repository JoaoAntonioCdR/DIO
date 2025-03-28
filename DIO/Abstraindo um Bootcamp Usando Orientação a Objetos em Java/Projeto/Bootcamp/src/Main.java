import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 =  new Curso();
        System.out.println(curso1);
        curso1.setTitulo("Curso Java");
        curso1.setDescricao(("Descrição Curso Java"));
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        System.out.println(curso1);
        curso2.setTitulo("Curso JS");
        curso2.setDescricao(("Descrição Curso JS"));
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
