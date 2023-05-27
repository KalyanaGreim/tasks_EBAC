package org.mod17;

class Sedan extends Carro {
    public Sedan(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Sedan: " + getMarca() + " " + getModelo());
    }
}
