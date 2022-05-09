package com.company;

import java.util.Scanner;

//Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes d semana dele.
//Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
public class vetoresexercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefasDoDia = new String[5];
        for(int i = 0; i < tarefasDoDia.length; i++) {
            System.out.println("tarefa" + i + ":");
            tarefasDoDia[i] = scanner.nextLine();
            System.out.println("quais são as suas tarefas");
            for(int i1 = 0; i1 < tarefasDoDia.length; i1++) ;
            System.out.println(i + ":" + tarefasDoDia[i]);
        }
        scanner.close();


    }
}