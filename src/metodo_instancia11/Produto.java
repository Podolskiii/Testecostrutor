package metodo_instancia11;

public class Produto {

    static final  Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;

    Integer quantidadeEstoque;

     public Boolean eNecessarioReporEstoque(Produto produto){
         return produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;

    }

}

