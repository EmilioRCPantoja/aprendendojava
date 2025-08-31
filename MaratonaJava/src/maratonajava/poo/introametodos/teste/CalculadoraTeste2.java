
package maratonajava.poo.introametodos.teste;

import maratonajava.poo.introametodos.dominio.Calculadora;


public class CalculadoraTeste2 {
    public static void main(String[] args){
        double result;
        
        Calculadora calc = new Calculadora();
        
        result = calc.divideDoisNumeros(4, 2);
        
        System.out.println(result);
        
        calc.imprimePar(result);
    }
       
}
