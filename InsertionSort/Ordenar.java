import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordenar {

    // atributos
    private String nome;
    int quantidade;


    // arraylist
    List<String> listaNomes = new ArrayList<>();


    // construtor
    public Ordenar() {
    }

    // método para imprimir a lista de nomes
    public void imprimirLista() {
      System.out.println("\nLista de nomes em ordem alfabética:\n");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Nome: " + listaNomes.get(i));
        }

    }


    // método para coletar nomes e adiciona-los no arrayList
    public void coletarNomes(Scanner sc) {
        System.out.println("Quantos nomes serão cadastrados? ");
        quantidade = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = sc.nextLine();
            listaNomes.add(nome);
            }
    }


    // método insertion short para organizar os nomes em ordem alfabética
    public void insertionShort() {
        int elementos = listaNomes.size();
        for (int i = 0; i < elementos; i++) {
            String valorUm = listaNomes.get(i);
            int j = i-1;
            while (j >= 0 && listaNomes.get(j).compareTo(valorUm) > 0) {
                listaNomes.set(j+1, listaNomes.get(j));
                j--;
            }
            listaNomes.set(j+1, valorUm);

        }
    }

    // Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
