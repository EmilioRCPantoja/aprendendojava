package maratonajava.poo.introametodos.teste;

import maratonajava.poo.introametodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] Args){
        Pessoa pessoa = new Pessoa();

       pessoa.setIdade(28);
       pessoa.setNome("Triciclano");

        //  pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
