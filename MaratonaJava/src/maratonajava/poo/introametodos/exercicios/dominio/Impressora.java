package maratonajava.poo.introametodos.exercicios.dominio;

public class Impressora {
    public void  ImprimeDados(Funcionario funcionario){
        System.out.println("nome: " + funcionario.nome);
        System.out.println("idade: " + funcionario.idade);
        if(funcionario.salarios == null){
            return;
        }
        int j = 1;
        for(float i: funcionario.salarios){

            System.out.println("salario " + j + ": "+ i);
            j++;

        }

    }

    public void mediaSalarios(Funcionario funcionario){
        if(funcionario.salarios == null){
            return;
        }
        float media = 0;
        for(float i: funcionario.salarios){
            media += i;
        }
        media = media / funcionario.salarios.length ;

        System.out.println("A média dos salários de " + funcionario.nome + " é de: " + media);
    }
}
