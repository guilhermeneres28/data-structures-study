import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];

    /*
        Quanto mais alunos tem no vetor mais demorada vai ser a insersão
        Complexidade: O(n) -> Pois inserir um aluno depende do numero de elementos existestes na lista
     */
    public void adiciona(Aluno aluno) {
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
    }

    public Aluno pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {

    }

    public boolean contem(Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return 0;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}
