import java.util.ArrayList;

public class Ordenar {

    // atributos
    private String palavra;

    // construtor
    public Ordenar() {
    }
    

    // método quickSort para ordenar
    public void quickSort(ArrayList<String> array , int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(array, esquerda, direita);
            quickSort(array, esquerda, p );
            quickSort(array, p + 1, direita);
        }
    }


    // método de repartição do quickSort
    public int particao(ArrayList<String> array, int esquerda, int direita) {
        int meio = (int) (esquerda + direita)/2;
        String pivot = array.get(meio);
        int i = esquerda - 1;
        int j = direita + 1;
    while (true) {
        do {
            i++;

        } while(array.get(i).compareTo(pivot) < 0);

        do {
            j--;

        } while(array.get(j).compareTo(pivot) > 0);
        if (i >= j) {
            return j;
        }
        String auxiliar = array.get(i);
        array.set(i, array.get(j));
        array.set(j, auxiliar);
    }
}

// Gets e Sets
    public String getPalavra() {
        return palavra;
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}

   


  