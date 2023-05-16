package org.mod15;

public class FabricaCarros {
    public Car criarCarroEletrico(int portas, String nome, String color, String tipo) {
        return new Eletrico(portas, nome, color, tipo);
    }

    public Car criarCarroCombustao(int portas, String nome, String color, String tipo) {
        return new Combustao(portas, nome, color, tipo);
    }
}
