package br.senai.lab365.futurodev.carros.main;

import br.senai.lab365.futurodev.carros.models.Carro;

public class Main {
    public static void main(String[] args) {
        // Cria um carro com construtor vazio e define velocidade máxima logo em seguida
        Carro uno = new Carro();
        uno.setVelocidadeMaxima(100); // Definido cedo para evitar problemas com acelerar()
        System.out.println("O carro está ligado? " + uno.isLigado());

        uno.ligar();
        System.out.println("O carro está ligado? " + uno.isLigado());

        uno.desligar();
        System.out.println("O carro está ligado? " + uno.isLigado());

        uno.ligar();
        uno.acelerar(2); // Acelera até 2
        System.out.println("Mais aceleração");
        uno.acelerar(3); // Acelera até 5

        uno.desligar(); // Desligar já zera a velocidade, frear() após isso é redundante

        uno.ligar();
        uno.acelerar(3); // Acelera até 3
        uno.frear(2); // Freia até 1
        uno.frear(2); // Freia até 0

        uno.setSomBuzina("Biiiii");
        uno.buzinar();
    }
}