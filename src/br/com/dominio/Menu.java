package br.com.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {


    Desenvolvedor dev;
    private Scanner scan;


    public Menu(Scanner scan) {
        this.scan = scan;
    }

    public String exibeMenu() {

        return "------- Escolha uma opção abaixo --------- \n"+
                "1 - Cadastrar Curso oo Metoria \n"+
                "2 - Cadastrar novo Desenvolvedor \n"+
                "3 - Progredir Dev no bootcamp \n"+
                "0 - finalizar \n";
    }

    public void selecionaOpcaoMenu(int opcao) {
        switch(opcao) {
            case 1:{
                System.out.println("Escolha uma opção: \n"+
                        "1 - Cadastrar Curso \n"+
                        "2 - Cadastrar Mentoria \n");
                int escolher = scan.nextInt();
                if(escolher == 1){

                    Curso curso = new Curso();
                    System.out.println("Digite o título do Curso");
                    curso.setTitulo(scan.next());
                    System.out.println("Descreva o curso 'Descrição' ");
                    curso.setDescricao(scan.next());
                    System.out.println("Qual a carga horária do curso? ");
                    int ch = scan.nextInt();
                    curso.setCargaHoraria(ch);
                    System.out.println("Curso cadastrado com sucesso.");
                    curso.cadastroCursoNoBootcamp();
                    System.out.println("Curso cadastrado no Bootcamp.");
                    break;
                }
                if(escolher == 2){
                    Mentoria mentoria = new Mentoria();
                    System.out.println("Digite o título da Mentoria");
                    mentoria.setTitulo(scan.next());
                    System.out.println("Descreva a mentoria 'Descrição' ");
                    mentoria.setDescricao(scan.next());
                    mentoria.setData(LocalDate.now());
                    System.out.println("Mentoria cadastrada com sucesso.");
                    mentoria.cadastroMentoriaNoBootcamp();
                    System.out.println("Mentoria cadastrado no Bootcamp.");
                    break;
                }

            }
            case 2:{
                Desenvolvedor dev = new Desenvolvedor();
                System.out.print("Qual nome do Dev? ");
                dev.setNome(scan.next());
                dev.cadastrarDev();
                System.out.print("Dev inscrito no Bootcamp. Seja bem vindo!");
                System.out.println("Conteudos inscrito de "+ dev +"" + dev.getConteudosInscrito());
                System.out.println("XP: "+ dev.calcularTotalXP());
                break;
            }
            case 3:{
                int cont = 0;
                System.out.println("Quantos curso o dev concluiu? ");
                int prog = scan.nextInt();
                for (int i = 0; i <= prog; i ++){
                    dev.progredir();
                    cont += 1;
                }
                System.out.println("O dev progrediu "+ cont + " conteúdos.");
                break;
            }
            default:
                System.out.println("Opção inválida! Tente uma opção entre '0 e 3'");
        }
    }

}
