package org.mod11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Fazer um programa que receba uma lista de nomes e ordene em ordem alfabética.

public class Colecoes_parte_1 {
    public static void main(String args[]) {
        ordenacaoNomes();
    }
    private static void ordenacaoNomes() {
        System.out.println("****** NOMES EM ORDEM ALFABETICA ******");
        List<Nomes> list = new ArrayList<Nomes>();
        Nomes a = new Nomes("Emily Torres");
        Nomes b = new Nomes("Amber Patterson");
        Nomes c = new Nomes("Adrian Reed");
        Nomes d = new Nomes("Kelly Williams");
        Nomes e = new Nomes("Tony Nunez");
        Nomes f = new Nomes("Jason Haley");
        Nomes g = new Nomes("Lauren Gibson");
        Nomes h = new Nomes("Matthew Thomas");
        Nomes i = new Nomes("Karen Martinez");
        Nomes j = new Nomes("Chad Hernandez");
        Nomes k = new Nomes("Brenno Vasquez");

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);
        list.add(j);
        list.add(k);

        Collections.sort(list);
        System.out.println(list);

    }
}
