package maratonajava.poo.associacao.dominio;

//Associação unidirecional 1 para muitos com Escola
//Professor não tem acesso a Escola :)
public class Professor {
    private String nome;

    public Professor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
