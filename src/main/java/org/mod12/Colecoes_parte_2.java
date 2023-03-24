package org.mod12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Colecoes_parte_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String nomesString = scanner.nextLine();

        String[] nomesArray = nomesString.split(",");
        ArrayList<String> nomes = new ArrayList<>();

        for (String nome : nomesArray) {
            nomes.add(nome);
        }

        Collections.sort(nomes);

        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome e o gênero (M ou F) separados por traço (-) (ou sair para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("sair")) {
                break;
            }

            String[] partes = entrada.split("-");
            String nome = partes[0];
            String genero = partes[1];

            if (genero.equals("M")) {
                masculino.add(nome);
            } else if (genero.equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Gênero inválido. Tente novamente.");
            }
        }

        System.out.println("Nomes masculinos:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Nomes femininos:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}

