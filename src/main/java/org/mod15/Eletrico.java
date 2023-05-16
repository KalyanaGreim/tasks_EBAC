package org.mod15;

public class Eletrico extends Car{
    public Eletrico(int portas, String nome, String color, String tipo) {
        super(portas, nome, color, tipo);
    }

    public Eletrico() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Carro elétrico");
        System.out.println("Cor: " + getColor());
        System.out.println("Portas: " + getPortas());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + getNome());
    }
}
