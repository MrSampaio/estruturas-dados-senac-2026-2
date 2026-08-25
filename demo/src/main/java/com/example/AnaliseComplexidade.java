package com.example;

public class AnaliseComplexidade {
    private static final int N = 10;

    public void tempoConstante(int[] numeros){
        System.out.println("Primeiro numero do vetor: " + numeros[0] + "\n");
    }

    public void tempoLogaritmico(int n){
        int passos = 0;

        int valor = n;

        while(valor > 1){
            valor = valor / 2;
            passos++;

            System.out.println("Passo: " + passos + "\n valor reduzido para: " + valor + "\n");
        }
    }

    public void tempoLinear(int n){
        for(int i = 0; i < n; i++){
            System.out.println("Contando: " + i + "\n");
        }
    }

    public void tempoQuadratico(int n){
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n; j++){
                System.out.println("Contando i: " + i + "\n");
                System.out.println("Par: (" + i + "" + j + ")");
            }
        }
    }
}
