package maratonajava.poo.introametodos.dominio;

//nesse caso, o ideal seria manter uma classe separada para cada um ;)

public class EstudanteQueImprime {
    public String nome;
    public int idade;
    public char sexo;

    public void  imprime(){
        System.out.println("---------------------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("sexo: " + this.sexo);
    }

}

