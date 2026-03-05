public class Teste08 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(4);

        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("B");
        vetor.adicionarSeNaoExiste("C");
        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("D");

        System.out.println(vetor);

    }

}