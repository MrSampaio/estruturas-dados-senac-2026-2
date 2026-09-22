package com.demo;

public class NoLista {
    public static class No<T>{

            private T valor;
            private No<T> proximo;

            // construtor
            private No(T valor) {
                this.valor = valor;
            }
        }
}
