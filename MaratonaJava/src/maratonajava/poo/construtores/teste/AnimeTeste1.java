package maratonajava.poo.construtores.teste;

import maratonajava.poo.construtores.dominio.Anime;

public class AnimeTeste1 {
    static void main() {
        Anime anime = new Anime("drama", 26, "Neon Genesis Evangelion");

        anime.setGenero("ação");
        anime.setEpisodios(24);
    }
}

