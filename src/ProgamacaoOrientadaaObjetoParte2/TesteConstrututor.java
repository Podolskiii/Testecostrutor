package ProgamacaoOrientadaaObjetoParte2;

public class TesteConstrututor {
    public static void main(String[] args ) {
        Pessoa p1 = new Pessoa("joao");
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
        Pessoa p2 = new Pessoa("Maria", 22);
        System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");

    }
}
