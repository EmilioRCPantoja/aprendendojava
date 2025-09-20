package maratonajava.poo.construtores.dominio;



public class Anime {
    private String genero;
    private int episodios;
    private String nome;
    private String estudio;

    public Anime(String nome, int episodios, String genero){
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String genero, int episodios,String estudio ){
        this(nome, episodios, genero);
        this.estudio = estudio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero(){
            return this.genero;
    }

    public int getEpisodios(){
            return this.episodios;
    }


}

