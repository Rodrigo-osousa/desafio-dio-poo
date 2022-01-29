import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();


        devRodrigo.imprimirCursosInscritos();
        devRodrigo.imprimirCursosConcluidos();

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        devMarcos.progredir();

        devMarcos.imprimirCursosInscritos();
        devMarcos.imprimirCursosConcluidos();
        devMarcos.imprimirExp();




    }
}
