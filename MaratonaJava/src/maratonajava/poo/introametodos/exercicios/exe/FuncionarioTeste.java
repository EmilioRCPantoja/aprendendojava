package maratonajava.poo.introametodos.exercicios.exe;

import maratonajava.poo.introametodos.exercicios.dominio.Funcionario;
import maratonajava.poo.introametodos.exercicios.dominio.Impressora;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Impressora impressora = new Impressora();

        funcionario.nome = "uriarte";
        funcionario.idade = 38;
        funcionario.salarios = new float[]{20000, 10000, 15000};

        impressora.ImprimeDados(funcionario);

        System.out.println("-------------------------------------");

        impressora.mediaSalarios(funcionario);

    }

}
