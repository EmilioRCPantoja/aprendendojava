package maratonajava.poo.associacao.dominio;

//Relação unidirecional 1 para 1 com jogador, time não tem "ciência" dos jogadores
public class Time {
    private String nome;

    public Time(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return this.nome;
    }
}
