package maratonajava.poo.associacao.teste;

import maratonajava.poo.associacao.dominio.Escola;
import maratonajava.poo.associacao.dominio.Professor;



public class EscolaTeste1 {
    public static void main(String[] args) {
        Professor professor = new Professor("Pizzini");
        Professor professor2 = new Professor("Ladeira");
        Professor[] professores = {professor, professor2};
        Escola escola  = new Escola("IF", professores);

        escola.imprime();

    }
}
