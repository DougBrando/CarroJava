# Projeto CarroJava

Este é um projeto simples em Java que simula o comportamento básico de um carro, como ligar, desligar, acelerar, frear e buzinar. Foi desenvolvido como um exercício para praticar conceitos de Programação Orientada a Objetos (POO), incluindo encapsulamento, construtores e métodos.

## Estrutura do Projeto
- **Pasta `src`**: Contém o código-fonte do projeto.
  - **`main/Main.java`**: Classe principal que testa as funcionalidades do carro.
  - **`models/Carro.java`**: Classe que define o modelo do carro e seus comportamentos.

## Funcionalidades
- **Ligar/Desligar**: Controla o estado do carro (ligado ou desligado).
- **Acelerar**: Aumenta a velocidade até um limite máximo configurável.
- **Frear**: Reduz a velocidade até zero.
- **Buzinar**: Emite um som personalizado para a buzina.
- Encapsulamento completo com getters e setters para os atributos.

## Pré-requisitos
- **Java JDK**: Versão 8 ou superior instalada.
- Uma IDE (ex.: IntelliJ IDEA, Eclipse) ou um terminal para compilar e executar o código.

## Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/DougBrando/CarroJava.git

2. Navegue até a pasta do projeto:
   ```bash
   cd CarroJava

```markdown
3. Compile o código:
   ```bash
   javac src/br/senai/lab365/futurodev/carros/main/Main.java

```markdown
4. Execute o programa:
   ```bash
   java -cp src br.senai.lab365.futurodev.carros.main.Main


## Exemplo de Saída
```text
O carro está ligado? false
Carro foi ligado
O carro está ligado? true
Carro foi desligado
O carro está ligado? false
Carro foi ligado
Carro acelerando... Velocidade atual: 1
Carro acelerando... Velocidade atual: 2
Mais aceleração
Carro acelerando... Velocidade atual: 3
Biiiii


## Observações
- O projeto usa valores padrão para a velocidade máxima (100) e som da buzina ("Bip"), que podem ser alterados via setters.

## Contribuições
Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias!

## Licença
Este projeto é de uso livre para fins educacionais.
