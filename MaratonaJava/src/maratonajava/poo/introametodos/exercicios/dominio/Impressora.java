package maratonajava.poo.introametodos.exercicios.dominio;

public class Impressora {
    public void  ImprimeDados(Funcionario funcionario){
        System.out.println("nome: " + funcionario.getNome());
        System.out.println("idade: " + funcionario.getIdade());
        if(funcionario.getSalarios() == null){
            return;
        }
        int j = 1;
        for(float i: funcionario.getSalarios()){

            System.out.println("salario " + j + ": "+ i);
            j++;

        }

    }

    public void mediaSalarios(Funcionario funcionario){
        if(funcionario.getSalarios() == null){
            return;
        }
        float media = 0;
        for(float i: funcionario.getSalarios()){
            media += i;
        }
        media = media / funcionario.getSalarios().length ;

        System.out.println("A média dos salários de " + funcionario.getNome() + " é de: " + media);
    }
}
