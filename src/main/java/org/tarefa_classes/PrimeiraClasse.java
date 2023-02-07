package org.tarefa_classes;

public class PrimeiraClasse {

    public static void main(String[] args) {
        // Tipo variavel, variavel, instancia quando tipo e uma classe
        Cliente cliente = new Cliente();
        System.out.println("Ola Kaly");
        cliente.cadastrarEndereco("rua alberto");
        //pega endereço para impressao no console
        System.out.println(cliente.getEndereco());
    }
}
