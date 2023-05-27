package org.mod17;
import java.util.ArrayList;
import java.util.List;

//        Generics é uma funcionalidade introduzida na versão 5 do Java. Seu
//        objetivo é fornecer ao desenvolvedor a capacidade de escrever
//        código que seja reutilizável e ao mesmo tempo com a segurança da
//        verificação de tipos em tempo de compilação. As APIs da própria
//        linguagem utilizam largamente estas funcionalidades, como é o caso
//        das conhecidas interfaces List e Map por exemplo.
//        O Generics é delimitado pelos caracteres “<>”, ou seja, quando
//        houver esse par de caracteres em uma parte qualquer do código,
//        significa que o Generics está sendo utilizado
public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        System.out.println("MODELOS DE CARROS:");
        System.out.println("_____________________");
        listaCarros.add(new Sedan("Toyota", "Corolla"));
        listaCarros.add(new Hatchback("Volkswagen", "Gol"));
        listaCarros.add(new SUV("Jeep", "Compass"));

        for (Carro carro : listaCarros) {
            carro.exibirInformacoes();
        }
        System.out.println("_____________________");
    }

}

