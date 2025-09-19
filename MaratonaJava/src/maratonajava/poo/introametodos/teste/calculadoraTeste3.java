package maratonajava.poo.introametodos.teste;

import maratonajava.poo.introametodos.dominio.Calculadora;

public class calculadoraTeste3 {
    public static void main(String[] args){
        Calculadora calculadora1 = new Calculadora();

        int a[] = {1, 2, 3, 4};

        calculadora1.somaArray(a);

        // a sacana da jvm transforma os aergumentos em um array
        //logo, passar um array como argumento também funciona :)
        calculadora1.somaVarArgs(a);

        calculadora1.somaVarArgs(1,2,3,4,5);
    }


}
