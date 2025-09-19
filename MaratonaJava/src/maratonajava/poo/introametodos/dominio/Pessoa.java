package maratonajava.poo.introametodos.dominio;

public class Pessoa {
    private String nome = null;
    private int idade = 0;

    public void imprime(){
        System.out.println("-----------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println("----------------------------- \n");
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome ;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("idade inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}

