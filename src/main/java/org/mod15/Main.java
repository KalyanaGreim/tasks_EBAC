package org.mod15;

public class Main {
    public static void main(String[] args) {
        FabricaCarros fabrica = new FabricaCarros();

        Car carroEletrico = fabrica.criarCarroEletrico(4, "Tesla Model S", "Vermelho", "Esportivo");
        Car carroCombustao = fabrica.criarCarroCombustao(2, "Ferrari 458 Italia", "Amarelo", "Esportivo");

        carroEletrico.mostrarInformacoes();
        System.out.println("--------");
        carroCombustao.mostrarInformacoes();
    }
}
