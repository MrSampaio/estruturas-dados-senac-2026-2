package com.example;
import javax.swing.JOptionPane;

public class CalcMedia {

    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1() {
        this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: ")); 
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2() {
        this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: ")); 
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3() {
        this.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota: "));
    }

    public double CalcMediaFunc(){
        setNota1();
        setNota2();
        setNota3();
        setMedia();

        return getMedia();
    }

    public void setMedia(){
        this.media = (getNota1() + getNota2() + getNota3()) / 3;
    }

    public double getMedia(){
        return media;
    }
}
