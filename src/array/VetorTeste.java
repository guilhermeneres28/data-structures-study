package array;

import array.Aluno;
import array.Vetor;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("Jose");
        Aluno a4 = new Aluno("Jose");
        Aluno a5 = new Aluno("Jose");
        Aluno a6 = new Aluno("Jose");

        Vetor lista = new Vetor(6);

        System.out.println("Tamanho da lista " + lista.tamanho());
        lista.adiciona(a1);
        System.out.println("Tamanho da lista " + lista.tamanho());
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        System.out.println("Tamanho da lista " + lista.tamanho());

        System.out.println("Contem: " + lista.contem(a1));

        Aluno francisco = new Aluno("Francisco");
        lista.adiciona(2, francisco);

        System.out.println("Contem: " + lista.contem(a3));

        System.out.println(lista.toString());
    }
}
