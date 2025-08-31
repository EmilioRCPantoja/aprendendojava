
package maratonajava.poo.introaclasses.teste;

import maratonajava.poo.introaclasses.dominio.Carro;


public class CarroTeste {
    public static void main(String[] args)
    {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro1.ano = 1999;
        carro1.modelo = "Hatch";
        carro1.nome = "Fiestinha brabo";
        
        carro2.ano = 2008;
        carro2.modelo = "Turbo";
        carro2.nome = "Uninho tunado";
    }
}
