package br.com.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Curso extends Conteudo {

    private int cargaHoraria;
    Bootcamp bootcamp;

    private Set<Conteudo> cursos = new LinkedHashSet<>();

    public void cadastroCursoNoBootcamp(){
        this.cursos.addAll(getCursos());
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public Set<Conteudo> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Conteudo> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_INICIAL + 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHoraria == curso.cargaHoraria && Objects.equals(cursos, curso.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargaHoraria, cursos);
    }
}

