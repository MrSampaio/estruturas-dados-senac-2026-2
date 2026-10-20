package com.arvores;

public class ArvoreDemo extends ArvoreBase{
    

    @Override 
    public void demonstrar(){
        NoArvore<String> empresa = new NoArvore("Empresa nova");
        definirRaiz(empresa);

        NoArvore<String> financeiro = new NoArvore("Financeiro");
        empresa.adicionarFilho(financeiro);

        NoArvore<String> contas = new NoArvore("Contas");
        financeiro.adicionarFilho(contas);

        exibirResumo();

    }

    public static void main(String[] args) {
        new ArvoreDemo().executarDemonstracao();
    }


}
