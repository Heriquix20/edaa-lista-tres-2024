import java.util.ArrayList;

public class Ordenar {

    // atributos
    private String palavra;

    // construtor
    public Ordenar() {
    }

    // método para ordenar em ordem crescente a string
    public void bubbleShort() {
        int tamanhoPalavra = palavra.length();  // armazenei a quantidade de posições da string
        ArrayList<String> arrayList = new ArrayList<>(); // transformei a string em arrayList
        for (int x = 0; x < palavra.length(); x++) {
            arrayList.add(String.valueOf(palavra.charAt(x)));  //loop para ir adicionando cada letra da String na lista
        }
        for(int i = 0; i < tamanhoPalavra; i++ ) {  // loop bubble sort
            for(int j = 0; j < tamanhoPalavra - 1; j++) {
                if (arrayList.get(j).compareTo(arrayList.get(j+1)) > 0) {
                    String auxiliar = arrayList.get(j+1);
                    arrayList.set(j+1, arrayList.get(j));
                    arrayList.set(j, auxiliar);
                }
            }
        } 
    System.out.println("\nEm ordem crescente: " + arrayList);
    }

    // Gets e Sets
    public String getPalavra() {
        return palavra;
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
}
