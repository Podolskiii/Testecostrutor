package com.company;

import java.util.Scanner;

public class exercicio3lista1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número");
            Integer numero1 = scanner.nextInt();
            System.out.println("Digite outro número");
            Integer numero2 = scanner.nextInt();
            System.out.print("A soma dos dois é:   " + (numero1 + numero2));
            scanner.close();
        }
    }
