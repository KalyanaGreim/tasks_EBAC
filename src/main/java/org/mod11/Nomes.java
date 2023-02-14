package org.mod11;

public class Nomes implements Comparable<Nomes> {

    private String nome;

    public Nomes(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Nomes nomes) {
        return this.nome.compareTo(nomes.getNome());
    }
}