import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // instanciei as classes
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

        o.coletarNomes(sc);  //chamei o método para coletar os nomes

        o.insertionShort();  // chamei o método para ordernar os nome da lista em ordem alfabética

        o.imprimirLista();   // chamei o método de imprimir novamente so que desta vez ela estará ordenada

        sc.close();

    }
    
}