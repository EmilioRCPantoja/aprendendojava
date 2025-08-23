
package maratonajava.poo.introaclasses.teste;

import maratonajava.poo.introaclasses.dominio.Estudante;


public class EstudanteTeste {
    public static void main(String[] args)
    {
        Estudante eu = new Estudante();
        eu.idade = 18;
        eu.nome = "Emilio";
        eu.sexo = 'M';
       
        System.out.println(eu.idade);
    }
    
}
