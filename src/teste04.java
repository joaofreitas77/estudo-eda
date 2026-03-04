public class teste04 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println("antes de remover");
        System.out.println(vetor);

        vetor.remove(1);

        System.out.println("Depois de remover");
        System.out.println(vetor);
    }}
