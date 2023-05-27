package org.mod17;

class SUV extends Carro {
    public SUV(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("SUV: " + getMarca() + " " + getModelo());
    }
}
