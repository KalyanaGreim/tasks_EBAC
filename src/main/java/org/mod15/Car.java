package org.mod15;

public abstract class Car {
    private int portas;
    private String nome;
    private String color;
    private String tipo;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Car(int portas, String nome, String color, String tipo) {
        this.portas = portas;
        this.nome = nome;
        this.color = color;
        this.tipo = tipo;
    }

    public Car() {

    }

    public void mostrarInformacoes() {

    }
}
