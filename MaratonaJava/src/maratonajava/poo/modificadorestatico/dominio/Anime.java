package maratonajava.poo.modificadorestatico.dominio;

public class Anime {
    private String genero;
    private static int[] episodios;
    private String nome;
    private String estudio;

    static {
        episodios = new int[100];

        for(int i = 0; i < episodios.length;i++ ){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome, int episodios, String genero){
        this.nome = nome;
        Anime.episodios = new int[100];
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
        Anime.episodios = new int[100];
    }

    public String getGenero(){
        return this.genero;
    }

    public int[] getEpisodios(){
        return Anime.episodios;
    }


}