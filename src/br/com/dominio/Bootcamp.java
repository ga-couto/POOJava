package br.com.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial =    LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Desenvolvedor> devs = new HashSet<>();
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }


    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }


    public Set<Desenvolvedor> getDevs() {
        return devs;
    }
    public void setDevs(Set<Desenvolvedor> devs) {
        this.devs = devs;
    }


    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }
    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }


    public Set<Curso> getCursos() {return cursos;}
    public void setCursos(Set<Curso> cursos) {this.cursos = cursos;}

    public Set<Mentoria> getMentorias() {return mentorias;}
    public void setMentorias(Set<Mentoria> mentorias) {this.mentorias = mentorias;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devs, bootcamp.devs) && Objects.equals(conteudosBootcamp, bootcamp.conteudosBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devs, conteudosBootcamp);
    }
}
