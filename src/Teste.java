public class Teste {
    static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("A");
        vetor.adiciona("GB");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor.busca("D"));
    }
}
