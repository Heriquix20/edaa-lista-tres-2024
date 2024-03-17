import java.util.Scanner;

public class Ordenar {

     // construtor
     public Ordenar() {
    }


    // método para receber os dados do usuario
    public void receberNomes(Scanner sc, int quantidade, String[] nomes) {
        sc.nextLine();
       for (int i = 0; i < quantidade; i++) {
         System.out.print("Insira os nomes aqui: ");
         nomes[i] = sc.nextLine();
       }
    }


    // método selection sort para ordenar
    public void selectionSort(String[] nomes) {
        for (int i = 0; i < nomes.length - 1; i++) {
            int menor = i;  // amrmazena o menor

            for (int j = menor + 1; j < nomes.length; j++) {  // j comça com 1+ que a variável i
               if (nomes[j].length() < nomes[menor].length()) {   // compara qual é o menor
                  menor = j;     // armazena o menor novamente
               }
            }
            if (menor != i) {
              String auxiliar = nomes[i];  // crio a variável e armazeno o valor na posição i
              nomes[i] = nomes[menor];
              nomes[menor] = auxiliar;
            }
        }
      
    }
}
