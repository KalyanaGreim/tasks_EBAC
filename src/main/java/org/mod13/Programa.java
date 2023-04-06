package org.mod13;

public class Programa {

    public static void main(String args[]){

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Maria");
        pessoaFisica.setEndereco("Rua 3");
        pessoaFisica.imprimir();

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Cia Teatro");
        pessoaJuridica.setEndereco("Rua XV");
        pessoaJuridica.imprimir();

    }
}
