package maratonajava.poo.modificadorestatico.teste;

import maratonajava.poo.modificadorestatico.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
