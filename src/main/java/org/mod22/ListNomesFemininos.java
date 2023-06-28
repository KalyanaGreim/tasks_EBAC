package org.mod22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListNomesFemininos {
    public static void main(String[] args) {
        List<Pessoa> pessoas = lerListaGeneroFeminino();

        List<String> nomesFemininos = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo() == 'F')
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        System.out.println("Nomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }

    private static List<Pessoa> lerListaGeneroFeminino() {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e sexos das pessoas (digite 'fim' para terminar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            char sexo;
            while (true) {
                System.out.print("Sexo (M/F): ");
                String genero = scanner.nextLine();
                if (genero.length() == 1 && (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F"))) {
                    sexo = genero.toUpperCase().charAt(0);
                    break;
                } else {
                    System.out.println("Gênero inválido. Digite 'M' para masculino ou 'F' para feminino.");
                }
            }

            pessoas.add(new Pessoa(nome, sexo));
        }

        return pessoas;
    }
}
