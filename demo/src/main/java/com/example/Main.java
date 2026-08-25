package com.example;

public class Main {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5};

        System.out.println("Hello world!");
        AnaliseComplexidade analise = new AnaliseComplexidade();

        analise.tempoConstante(numeros);

        analise.tempoLogaritmico(20);

        analise.tempoLinear(20);

        analise.tempoQuadratico(5);
    }
}