public class Teste07 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("B");

        System.out.println(vetor);
        vetor.removerTodos("B");
        System.out.println(vetor);
    }
}
