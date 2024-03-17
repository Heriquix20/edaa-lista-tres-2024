import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instânciei as classes 
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

        // variavel para armazenar o dado vindo do teclado
        String palavra;

        //coletar a palvara e setar na classe usando o setPalavra
        System.out.print("\nInforme uma palavra: ");
        palavra = sc.nextLine();
        o.setPalavra(palavra);

        // chamei o método para ordenar em ordem crescente
        o.bubbleShort();
        
        sc.close();
        
    }
}