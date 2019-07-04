package linkedList;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();

        System.out.println(listaLigada);
        listaLigada.adicionaNoComeco("Guilherme");
        System.out.println(listaLigada);
        listaLigada.adicionaNoComeco("Henrique");
        System.out.println(listaLigada);
        listaLigada.adicionaNoComeco("Neres");
        System.out.println(listaLigada);
        listaLigada.adiciona("Nascimento");
        System.out.println(listaLigada);
    }
}
