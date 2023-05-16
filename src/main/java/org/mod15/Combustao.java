package org.mod15;

public class Combustao extends Car{
    public Combustao(int portas, String nome, String color, String tipo) {
        super(portas, nome, color, tipo);
    }

    public Combustao() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Carro a combustão");
        System.out.println("Cor: " + getColor());
        System.out.println("Portas: " + getPortas());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + getNome());
    }
}
