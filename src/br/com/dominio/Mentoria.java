package br.com.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Mentoria extends Conteudo {

    Bootcamp bootcamp;
    private LocalDate data;
    private Set<Conteudo> mentorias = new LinkedHashSet<>();

    public void cadastroMentoriaNoBootcamp(){
        this.mentorias.addAll(getMentorias());
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Set<Conteudo> getMentorias() {
        return mentorias;
    }

    public void setMentorias(Set<Conteudo> mentorias) {
        this.mentorias = mentorias;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
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
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(data, mentoria.data) && Objects.equals(mentorias, mentoria.mentorias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, mentorias);
    }
}
