package maratonajava.poo.sobrecargametodos.dominio;

public class Anime {
    private String genero;
    private int episodios;
    private String nome;

    public void Anime(String genero, int episodios, String nome){
        this.genero = genero;
        this.episodios = episodios;
        this.nome = nome;
    }

    public void init(String  nome, int episodios){
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String nome, int episodios, String genero){
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getEpisodios(){
        return this.episodios;
    }


}
