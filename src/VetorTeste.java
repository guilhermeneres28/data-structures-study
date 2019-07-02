public class VetorTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista.contem(a1));

        Aluno a3 = new Aluno("Guilherme");

        System.out.println(lista.contem(a3));

        System.out.println(lista.toString());
    }
}
