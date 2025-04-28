package concessionaria;

import java.text.DecimalFormat;

public class Carro {
    String modelo;
    String marca;
    int velocidademáxima;
    int peso;
    String cor;
    boolean usado;
    int potência;
    float zeroacem;
    int ano;
    float consumocidade;
    float consumorodovia;
    boolean ligado;
    float kmsrodados;

    void status() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Modelo: "+this.modelo+".");
        System.out.println("Marca: "+this.marca+".");
        System.out.println("Velocidade máxima: "+this.velocidademáxima+"(Km/h).");
        System.out.println("Peso: "+this.peso+("Kg"));
        System.out.println("Cor: "+this.cor+".");
        System.out.println("É usado: "+this.usado+".");
        System.out.println("Potência: "+this.potência+"(Cv).");
        System.out.println("Tempo 0-100: "+this.zeroacem+"(S).");
        System.out.println("Ano: "+this.ano+".");
        System.out.println("Consumo: "+this.consumocidade+"(Km/l) na cidade e "+this.consumorodovia+"(Km/l) na rodovia.");
        System.out.println("O carro está " + (this.ligado ? "ligado." : "desligado."));
        System.out.println("Kms rodados: " + df.format(this.kmsrodados) + "Km");
        }
    void ligar() {
        this.ligado = true;
    }
    void desligar() {
        this.ligado = false;
    }
    void acelerar() {
        if (ligado) {
            System.out.println("Acelerando...");
        }
        else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }
}

