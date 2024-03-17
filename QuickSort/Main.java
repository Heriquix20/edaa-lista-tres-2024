import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instanciei as classes
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

        // coletar a string
        System.out.print("\nInforme uma palavra: ");
        String palavra = sc.nextLine();
        o.setPalavra(palavra);   // setar no atributo da classe

        // criei um arrayList
        ArrayList<String> array = new ArrayList<>();

        // adicionei elementos da string dento da lista pelo metodo add
        for (int i = 0; i < palavra.length(); i++) {
        array.add(String.valueOf(palavra.charAt(i)));
        }

        // imprimi a string antes
        System.out.println("\nString desordenada: ");
        System.out.println(array);
        
        // chamei o metodo quickSort para ordenar a string
        o.quickSort(array, 0, array.size()-1);

        // imprimi a string ordenada
        System.out.println("\nString ordenada em ordem crescente: ");
        System.out.println(array);

        sc.close();
    }
}