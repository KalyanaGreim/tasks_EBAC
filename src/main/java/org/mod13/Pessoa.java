package org.mod13;

public abstract class Pessoa {
    private String nome;
    private String endereco;

    public void imprimir() {
        System.out.println("O nome da Pessoa Fisica ou Juridica é " + this.nome + " com endereco em " + this.endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
