package concessionaria;

public class TesteCarros {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
        c1.cor = "Branco";
        c1.modelo = "Fiat Palio ELX 1.0 8V";
        c1.potência = 65;
        c1.usado = true;
        c1.velocidademáxima = 154;
        c1.peso = 975;
        c1.marca = "Fiat";
        c1.zeroacem = 16;
        c1.ano = 2005;
        c1.consumorodovia = 12.9f;
        c1.consumocidade = 8.7f;
        c1.kmsrodados = 116320f;
        c1.ligar();
        c1.status();
        c1.acelerar();
        System.out.println("=~=~=~=~=~=~=~=~=~=~");

        Carro c2 = new Carro();
        System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
        c2.cor = "Vermelho";
        c2.modelo = "Honda Civic Si 2.0";
        c2.potência = 192;
        c2.usado = true;
        c2.velocidademáxima = 215;
        c2.peso = 1322;
        c2.marca = "Honda";
        c2.zeroacem = 7.9f;
        c2.ano = 2009;
        c2.consumorodovia = 13.1f;
        c2.consumocidade = 8f;
        c2.kmsrodados = 76032f;
        c2.desligar();
        c2.status();
        c2.acelerar();
        System.out.println("=~=~=~=~=~=~=~=~=~=~");

    }
}
