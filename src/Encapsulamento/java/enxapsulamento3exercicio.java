package Encapsulamento.java;

import java.util.Scanner;

public class enxapsulamento3exercicio {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.desconto = 20.0;
        pedido.subtotal = 10.0;
        pedido.total = 0.0;
        pedido.codigo = 1000;

        System.out.println(" o codigo do Produto é: "  + pedido.getCodigo());
        System.out.println("Subtotal: " + pedido.getSubtotal());
        System.out.println("Desconto de : " + pedido.getDesconto());
        System.out.println("Total de : " + pedido.getTotal());
    }
}
