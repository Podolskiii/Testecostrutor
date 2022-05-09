package com.company;


import java.util.Scanner;

//Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7). Dependendo do número
     //   informado você deve imprimir o nome desse dia.
       // Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
public class SWITCH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7 dia da semana: ");
        Integer diaDaSemana = scanner.nextInt();
        String dia = null;
        switch (diaDaSemana){
            case 1: dia ="domingo";
            break;
            case 2: dia = "segunda";
            break;
            case 3: dia = "terça";
            break;
            case 4: dia = "quarta";
            break;
            case 5: dia = "quinta";
            break;
            case 6 :dia = "sexta";
            break;
            case 7 :dia = "sabado";
            break;
            default:
            System.exit(1);
        }
        System.out.println("seu dia é:" + dia);
    }
}
