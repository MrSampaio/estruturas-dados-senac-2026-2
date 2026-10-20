package com.arvores;

public abstract class ArvoreBase<T> {
    private NoArvore<T> raiz;

    protected void criarRaiz(T valor){
        if(raiz != null){
            throw new IllegalStateException("A raiz ja foi criada");
        }

        raiz = new NoArvore<>(valor);
    }

    protected void definirRaiz(NoArvore<T> novaRaiz){
        raiz = novaRaiz;
    }

    protected NoArvore<T> getRaiz(){
        return raiz;
    }

    protected NoArvore<T> adicionarFilho(NoArvore<T> pai, T valor){
        if(pai == null){
            throw new IllegalArgumentException("O no pai não pode ser nulo");
        }

        NoArvore<T> novoFilho = new NoArvore<>(valor);

        pai.adicionarFilho(novoFilho);

        return novoFilho;
    }

    protected boolean ehFolha(NoArvore<T> no){
        if(no == null){
            return false;
        }

        return no.ehFolha();
    }

    protected int contarNos(){
        return contarNos(raiz);
    }

    protected int contarNos(NoArvore<T> no){
        if(no == null){
            return 0;
        }

        int total = 1;

        for(NoArvore<T> filho : no.getFilhos()){
            total += contarNos(filho);
        }

        return total;
    }

    protected int contarFolhas(){
        return contarFolhas(raiz);
    }

    protected int contarFolhas(NoArvore<T> no){
        if(no == null){
            return 0;
        }

        if(no.ehFolha()){
            return 1;
        }

        int totalFolhas = 0;

        for(NoArvore<T> filho : no.getFilhos()){
            totalFolhas += contarFolhas(filho);
        }

        return totalFolhas;
    }

    protected int calcularAltura(){
        return calcularAltura(raiz);
    }

    protected int calcularAltura(NoArvore<T> no){
        if(no == null){
            return -1;
        }

        if(no.ehFolha()){
            return 0;
        }

        int maiorAlturaEntreFilhos = -1;

        for(NoArvore<T> filho : no.getFilhos()){
            int alturaDoFilho = calcularAltura(filho);

            if(alturaDoFilho > maiorAlturaEntreFilhos){
                maiorAlturaEntreFilhos = alturaDoFilho;
            }
        }

        return 1 + maiorAlturaEntreFilhos;

    }

    public void exibirResumo(){
        System.out.println("Raiz: " + (raiz == null ? "Sem raíz" : raiz));
        System.out.println("Quantidade total de nós: " + contarNos());
        System.out.println("Quantidade total de folhas: " + contarFolhas());
        System.out.println("Altura da árvore: " + calcularAltura());
    }

    public abstract void demonstrar();

    public void executarDemonstracao(){
        demonstrar();;
    }

}
