package linkedList;

import java.util.LinkedList;

public class ListaLigada {

    private Celula primeiroNode = null;
    private Celula ultimoNode = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(elemento, primeiroNode);
        this.primeiroNode = nova;

        if(this.totalDeElementos == 0) {
            this.ultimoNode = this.primeiroNode;
        }

        this.totalDeElementos++;
    }

    public void adiciona(Object elemento){

        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula novoNode = new Celula(elemento, null);
            this.ultimoNode.setProximo(novoNode);
            this.ultimoNode = novoNode;
            this.totalDeElementos++;
        }
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    public void adiciona(int posicao, Object elemento) {
    }

    public Celula pegaCelula(int posicao){

        if(!posicaoValida(posicao)) {
            throw new IndexOutOfBoundsException("posicao invalida");
        }

        Celula atual = primeiroNode;

        for(int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void remove(int posicao){}

    public int tamanho() {return 0;}

    public boolean contem(Object o) { return false;}

    @Override
    public String toString() {

        if(this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeiroNode;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }

        builder.append("]");
        return builder.toString();
    }
}
