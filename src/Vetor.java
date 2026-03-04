import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho; //tamanho real do vetor

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    //percorrer todo array nao é o metodo mais eficaz nesse caso

    public boolean adiciona(String elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.elementos[i]);
            if (i < this.tamanho - 1) {
                s.append(", ");
            }
        }

        s.append("]");
        return s.toString();
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void adiciona(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        this.aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao ; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        //desloca elementos pra esquerda
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;

        this.elementos[this.tamanho] = null;
    }

    public boolean remove(String elemento){
        int posicao = this.busca(elemento);

        if (posicao == -1){
            return false;
        }

        this.remove(posicao);
        return true;
    }

}
