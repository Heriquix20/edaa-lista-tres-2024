public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
        "Breno Vinicius", "Vinícius Raphael",
        "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
        "Felipe dos Santos",
        "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
        "Henrique Cezar",
        "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
        "Marcus Paulo",
        "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
        "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
        "Vinicius Garcia",
        "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
        "Lucas Marques",
        "Marcela Maria" };

        p.addNomes(nomes); // Adicionei os nomes no arrayList
        p.ordenar();       // Ordenei os nomes
        p.imprimir();      // Imprimi a Lista de pessoa com nome e idade

    }
}

