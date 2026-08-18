package com.example;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        CalcMedia media = new CalcMedia();

        //double result =  media.CalcMediaFunc();

        JOptionPane.showMessageDialog(null, "A media eh: " + media.CalcMediaFunc());

        // //CalcMedia media = new CalcMedia()
        // System.out.println("Informe a primeira nota: ");
        // double nota1 = scr.nextDouble();

        // System.out.println("Informe a segunda nota: ");
        // double nota2 = scr.nextDouble();

        // System.out.println("Informe a terceira nota: ");
        // double nota3 = scr.nextDouble();

        // double media = (nota1 + nota2 + nota3) / 3;

        // System.out.println("A media das notas eh: " + media);
        
    }
}
