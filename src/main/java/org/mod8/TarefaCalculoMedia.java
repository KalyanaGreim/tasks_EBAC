package org.mod8;

public class TarefaCalculoMedia {

    public static void main(String args[]) {
    mediaNotas();
    }

    public static void mediaNotas() {
        System.out.println("**** Media Final ****");
        double nota1 = 7.6;
        double nota2 = 5.5;
        double nota3 = 8.8;
        double nota4 = 9.6;
        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;
        System.out.println("A media das 4 notas e: " + media);

    }
}
