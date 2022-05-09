package com.company.EscritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Linhas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print(" Informe A tarefa  " + i + ": ");
            String nome = scanner.nextLine();
            Linhas.add(nome);
        }
        Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\TAREFADODIA");
        Files.write(arquivo, Linhas);
        scanner.close();
    }
}
