package br.com.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor {

    Bootcamp bootcamp;
    private String nome;
    private Set<Desenvolvedor> dev = new LinkedHashSet<>();
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void incricaoBootcamp(){
        this.conteudosInscrito.addAll(bootcamp.getConteudosBootcamp());
        bootcamp.getDevs().add(this);
    }
    public void cadastrarDev(){
        this.dev.addAll(getDev());
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else{
            System.err.println("Você não está inscrito em nenhum curso ou mentoria.");
        }
    }

    public double calcularTotalXP(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }

    public Set<Desenvolvedor> getDev() {
        return dev;
    }

    public void setDev(Set<Desenvolvedor> dev) {
        this.dev = dev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desenvolvedor that = (Desenvolvedor) o;
        return Objects.equals(bootcamp, that.bootcamp) && Objects.equals(nome, that.nome) && Objects.equals(dev, that.dev) && Objects.equals(conteudosInscrito, that.conteudosInscrito) && Objects.equals(conteudosConcluidos, that.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bootcamp, nome, dev, conteudosInscrito, conteudosConcluidos);
    }
}
