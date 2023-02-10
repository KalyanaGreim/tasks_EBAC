package org.mod10;

import java.util.Scanner;

public class Controle_Fluxos {

    public static void main(String args[]) {
        media_notas();
    }

    private static void media_notas() {
        Scanner nota = new Scanner(System.in);
        System.out.println("Digita a nota 1: ");
        double nota1 = nota.nextDouble();
        System.out.println("Digita a nota 2: ");
        double nota2 = nota.nextDouble();
        System.out.println("Digita a nota 3: ");
        double nota3 = nota.nextDouble();
        System.out.println("Digita a nota 4: ");
        double nota4 = nota.nextDouble();
        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;
        System.out.println("A media das 4 notas e: " + media);
        if(media >= 7){
            System.out.println("APROVADO");
        } else if (media >= 5 && media < 7) {
            System.out.println("RECUPERAÇAO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
