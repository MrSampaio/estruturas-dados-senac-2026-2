package com.arvores;

public class Senac extends ArvoreBase{
    @Override 
    public void demonstrar(){
        NoArvore<String> faculdade = new NoArvore("Senac");
        definirRaiz(faculdade);

        NoArvore<String> POO = new NoArvore("Programação orientada à objetos");
        faculdade.adicionarFilho(POO);

        NoArvore<String> ED = new NoArvore("Estrutura de Dados");
        faculdade.adicionarFilho(ED);

        NoArvore<String> PI = new NoArvore("Projeto Integrador");
        faculdade.adicionarFilho(PI);

        NoArvore<String> AI = new NoArvore("Arquitetura da Informação");
        faculdade.adicionarFilho(AI);

        NoArvore<String> UHC = new NoArvore("Usabilidade Humano Computador");
        faculdade.adicionarFilho(UHC);

        NoArvore<String> OAC = new NoArvore("Organização e Arquitetura de Computadores");
        faculdade.adicionarFilho(OAC);

        NoArvore<String> notaPOO = new NoArvore("6");
        POO.adicionarFilho(notaPOO);

        NoArvore<String> notaED = new NoArvore("7.5");
        ED.adicionarFilho(notaED);

        NoArvore<String> notaPI = new NoArvore("6.5");
        PI.adicionarFilho(notaPI);

        NoArvore<String> notaAI = new NoArvore("6.2");
        AI.adicionarFilho(notaAI);

        NoArvore<String> notaUHC = new NoArvore("6.9");
        UHC.adicionarFilho(notaUHC);

        NoArvore<String> notaOAC = new NoArvore("5");
        OAC.adicionarFilho(notaOAC);

        exibirResumo();
    }

    public static void main(String[] args) {
        new Senac().executarDemonstracao();
    }
}
