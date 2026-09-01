package com.example;
// # Exercicio 01 - Vetor no Supermercado

// ## Cenario real

// Voce esta desenvolvendo um sistema simples para um supermercado de bairro.
// No fim do dia, o gerente quer registrar o faturamento de cada caixa e descobrir:
// - Quanto foi o total do dia.
// - Qual caixa vendeu mais.
// - Qual caixa vendeu menos.

// Como existe uma quantidade fixa de caixas, a melhor estrutura inicial e um vetor.

// ## Objetivo

// Criar um programa que receba 5 valores de faturamento, armazene em um vetor e calcule resumo do dia.

// ## Passo a passo guiado

// 1. Declare um vetor de tamanho 5 para guardar faturamentos em `double`.
// 2. Crie um `for` para ler os 5 valores.
// 3. Crie variaveis para:
//    - `soma`.
//    - `maiorValor`.
//    - `menorValor`.
//    - `indiceMaior` e `indiceMenor`.
// 4. Percorra o vetor e atualize as variaveis de controle.
// 5. Mostre na tela:
//    - Total vendido.
//    - Media por caixa.
//    - Caixa com maior venda.
//    - Caixa com menor venda.

// ## Dicas

// - Inicialize `maiorValor` e `menorValor` com o primeiro elemento do vetor.
// - Lembre que o indice comeca em 0. Para mostrar numero do caixa, use `indice + 1`.

// ## Saida esperada (exemplo)

// Total do dia: 10500.00
// Media por caixa: 2100.00
// Maior venda: Caixa 4 com 3200.00
// Menor venda: Caixa 2 com 1200.00

// ## Desafio extra

// Mostre tambem quantos caixas ficaram acima da media.

import javax.swing.JOptionPane;
public class Exe_Supermercado {

    public void relatorioFaturamentos(){

        double[] faturamentos = new double[5];  
        double soma = 0;

        double maiorValor = faturamentos[0];
        double menorValor = faturamentos[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        double media;

        for(int i = 0; i < faturamentos.length; i++){
            faturamentos[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento do caixa " + (i + 1)));

            soma += faturamentos[i];

            if (i == 0) {
                maiorValor = faturamentos[i];
                menorValor = faturamentos[i];
                indiceMaior = (i + 1);
                indiceMenor = (i + 1);
            } else {
                if(faturamentos[i] < menorValor){
                    menorValor = faturamentos[i];
                    indiceMenor = (i + 1);
                }

                if(faturamentos[i] > maiorValor){
                    maiorValor = faturamentos[i];
                    indiceMaior = (i + 1);
                } 
            }
        }

        media = soma / faturamentos.length;

        JOptionPane.showMessageDialog(null, "Total do dia: R$" + soma);
        JOptionPane.showMessageDialog(null, "Media do caixa: R$" + media);
        JOptionPane.showMessageDialog(null, "Maior venda: Caixa " + indiceMaior + " com R$" + maiorValor);
        JOptionPane.showMessageDialog(null, "Menor venda: Caixa " + indiceMenor + " com R$" + menorValor);
    }
}
