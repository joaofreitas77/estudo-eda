public class Teste05 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println("antes de remover por busca");
        System.out.println(vetor);

        vetor.remove("B");
        System.out.println("depois de remover por busca");
        System.out.println(vetor);
    }
}
