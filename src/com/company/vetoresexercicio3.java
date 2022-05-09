package com.company;

import java.util.Scanner;

public class vetoresexercicio3 {


    public static void main(String[] args) {
        String[] cardapio = new String[]{"Calabresa", "Atum", "Queijo", "Presunto"};
        for (int i = 0; i < cardapio.length; i++) {
            System.out.println("[" + i + "] " + cardapio[i]);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número referente ao sabor: ");
            Integer saborEscolhido = scanner.nextInt();
            System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
            scanner.close();


            cardapio = new String[]{"Calabresa", "Atum", "Queijo", "Presunto"};
            cardapio[3] = "Frango";
            for (i = 0; i < cardapio.length; i++) {
                System.out.println(cardapio[i]);
            }


            cardapio = new String[4];
            cardapio[0] = "Calabresa";
            cardapio[1] = "Atum";
            cardapio[2] = "Queijo";
            cardapio[3] = "Presunto";

            for (i = 0; i < cardapio.length; i++) {
                System.out.println(cardapio[i]);
            }
        }
    }
}