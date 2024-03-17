import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // instanciei as classes
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

        // pedi a quantidade de nomes q seria utilizados
        System.out.print("\nInforme a quantidade de nomes a ser utilizado: ");
        int quantidade = sc.nextInt();  // armazenei a quantidade

        // criei um array
        String[] nomes = new String[quantidade];

        // chamei o metodo para ler os nomes
        o.receberNomes(sc, quantidade, nomes);

        // chamei o método para organizar os nomes por tamanho
        o.selectionSort(nomes);

        System.out.println("\nLista de nomes ordenada por tamanho: ");
        for ( int y = 0; y < nomes.length; y++) {
        System.out.println("Nome: " + nomes[y]);
        }

        sc.close();
        
    }
}