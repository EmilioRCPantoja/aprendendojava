package maratonajava.poo.modificadorestatico.teste;

import maratonajava.poo.modificadorestatico.dominio.Anime;

public class AnimeTeste1 {
    static void main() {
        Anime anime = new Anime("drama", 26, "Neon Genesis Evangelion");

        anime.setGenero("ação");
        anime.setEpisodios(24);
    }
}

