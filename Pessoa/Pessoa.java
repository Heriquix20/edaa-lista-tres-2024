import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pessoa implements Comparable<Pessoa>{

    // atributos
    private String nome;
    private int idade;

    // arraylist de pessoas
    List<Pessoa> listaPessoas = new ArrayList<>();

    // contrutor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // construtor vazio para instanciar na main
    public Pessoa() {
    }


    // método para ordenar a lista
    public void ordenar(){
       Collections.sort(listaPessoas);
    }


    // metodo para imprimir a lista ordenada
    public void imprimir() {
      System.out.println("Lista ordenada: ");
        for(Pessoa p : listaPessoas) {  // for each para percorrer toda a lista e ir pegando pessoa por pessoa
          System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
        }
    }


    // método para adicionar nomes no arraylist 
    public void addNomes(String[] nomes) {
        for (String nome : nomes) {    // Percorrer todo o array de nomes e armazenar na variável "nome"
            Random random = new Random();   // Intanciar a classe Random
            idade = random.nextInt(17, 25);  // Adicionei uma idade aleatoria pra cada pessoa
            Pessoa pessoa = new Pessoa(nome, idade);    // Instanciei o objeto Pessoa paasando o nome e idade pelo parâmetro
            listaPessoas.add(pessoa);   // Adicionei o objeto Pessoa no arrayList
        }
    }


    // compareTo
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }

    // Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(short idade) {
        this.idade = idade;
    }

}