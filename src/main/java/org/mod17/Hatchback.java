package org.mod17;

class Hatchback extends Carro {
    public Hatchback(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Hatchback: " + getMarca() + " " + getModelo());
    }
}