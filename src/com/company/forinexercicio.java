package com.company;

public class forinexercicio {
    public static void main(String[] args) {


        Double[] carrinhoDeCompra = new Double[]{50.0, 51.0, 52.0};
        Double total = 0.0;
        for (int i = 0; i < carrinhoDeCompra.length; i++) {
            total = total + carrinhoDeCompra[i];
            System.out.println(" interação" + i + "total: " + total);
            System.out.println("total: " + total);
        }
    }
}
