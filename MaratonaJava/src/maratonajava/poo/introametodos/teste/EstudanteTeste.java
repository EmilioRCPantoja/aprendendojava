/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maratonajava.poo.introametodos.teste;

import maratonajava.poo.introametodos.dominio.Estudante;
import maratonajava.poo.introametodos.dominio.ImpressaoEstudante;
import maratonajava.poo.introametodos.dominio.EstudanteQueImprime;

/**
 *
 * @author emi
 */
public class EstudanteTeste {
    public  static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        EstudanteQueImprime estudante03 = new EstudanteQueImprime();
        
        estudante01.nome = "Fulano";
        estudante01.idade = 15;
        estudante01.sexo = 'M';
        
        estudante02.nome = "Fulana";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        estudante03.nome = "Ciclano";
        estudante03.idade = 19;
        estudante03.sexo = 'M';

        ImpressaoEstudante impressora = new ImpressaoEstudante();
        
        impressora.imprime(estudante01);
        
        impressora.imprime(estudante02);

        estudante03.imprime();


        
    }
}
