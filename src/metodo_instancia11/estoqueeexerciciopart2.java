package metodo_instancia11;

public class estoqueeexerciciopart2 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 8;

        System.out.println("Necessário repor estoque do Produto " + produto.nome + " ?" + produto.eNecessarioReporEstoque(produto));


    }


    }



