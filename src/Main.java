import br.com.dominio.Curso;
import br.com.dominio.Mentoria;

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


    }
}
