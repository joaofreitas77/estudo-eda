public class Teste09 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("D");

        vetor.inserirDepois("A", "B");

        System.out.println(vetor);
    }
}
