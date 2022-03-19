import br.com.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("O melhor curso do mundo");
        cursoJava.setCargaHoraria(80);

        System.out.println(cursoJava);

        Mentoria mentoriaBoa = new Mentoria();
        mentoriaBoa.setTitulo("Mentoria top");
        mentoriaBoa.setDescricao("Melhor mentoria de Java");
        mentoriaBoa.setData(LocalDate.now());

        Conteudo cursoConteudo = new Curso();

        System.out.println("----------------------------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Um bootcamp cheio de desafios para você!");
        bootcamp.getConteudosBootcamp().add(cursoJava);
        bootcamp.getConteudosBootcamp().add(mentoriaBoa);

        Desenvolvedor devGabriel = new Desenvolvedor();
        devGabriel.setNome("Gabriel");
        devGabriel.incricaoBootcamp(bootcamp);
        System.out.println("Conteudos inscrito de Gabriel "+ devGabriel.getConteudosInscrito());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteudos inscrito de Gabriel "+ devGabriel.getConteudosInscrito());
        System.out.println("Conteudos concluídos de Gabriel "+ devGabriel.getConteudosInscrito());
        System.out.println("XP: "+ devGabriel.calcularTotalXP());


        System.out.println("-----------------------------------------------------------");
        Desenvolvedor devLaiana = new Desenvolvedor();
        devLaiana.setNome("Laiana");
        devLaiana.incricaoBootcamp(bootcamp);
        System.out.println("Conteudos inscrito de Laiana "+ devLaiana.getConteudosInscrito());
        devLaiana.progredir();
        devLaiana.progredir();
        System.out.println("Conteudos inscrito de Laiana "+ devLaiana.getConteudosInscrito());
        System.out.println("Conteudos concluídos de Laiana "+ devLaiana.getConteudosInscrito());
        System.out.println("XP: "+ devLaiana.calcularTotalXP());



    }
}
