package br.senai.lab365.futurodev.carros.models;

public class Carro {
    private String modelo;
    private String cor;
    private boolean ligado;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private String somBuzina;

    // Construtor com parâmetros
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeMaxima = 100; // Valor padrão razoável
        this.somBuzina = "Bip"; // Buzina padrão
    }

    // Construtor vazio com valores padrão para evitar comportamentos inesperados
    public Carro() {
        this.velocidadeMaxima = 100; // Velocidade máxima inicial
        this.velocidadeAtual = 0; // Velocidade inicial
        this.ligado = false; // Carro desligado por padrão
        this.somBuzina = "Bip"; // Som padrão da buzina
    }

    // Getters e setters omitidos para brevity, mas estão bem implementados

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public int getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(int velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }
    public boolean isLigado() { return ligado; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public String getSomBuzina() { return somBuzina; }
    public void setSomBuzina(String somBuzina) { this.somBuzina = somBuzina; }

    // Liga o carro se estiver desligado
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Carro foi ligado");
        }
    }

    // Desliga o carro e zera a velocidade
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Carro foi desligado");
            this.frear(this.velocidadeAtual); // Garante velocidade 0 ao desligar
        }
    }

    // Acelera incrementalmente até a velocidade máxima
    public int acelerar(int quantidade) {
        if (!this.ligado) {
            System.out.println("Carro desligado.");
            return 0;
        }
        for (int i = 0; i < quantidade; i++) {
            if (this.velocidadeAtual >= this.velocidadeMaxima) {
                System.out.println("Velocidade máxima atingida: " + this.velocidadeAtual);
                break;
            }
            this.velocidadeAtual++;
            System.out.println("Carro acelerando... Velocidade atual: " + this.velocidadeAtual);
        }
        return this.velocidadeAtual;
    }

    // Freia incrementalmente até 0, com mensagem corrigida
    public int frear(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            if (this.velocidadeAtual <= 0) {
                System.out.println("Velocidade mínima atingida: " + this.velocidadeAtual);
                break;
            }
            this.velocidadeAtual--;
            System.out.println("Carro freando... Velocidade atual: " + this.velocidadeAtual);
        }
        return this.velocidadeAtual;
    }

    // Buzina com proteção contra null
    public void buzinar() {
        System.out.println(this.somBuzina != null ? this.somBuzina : "Buzina não configurada");
    }
}