package MaratonandoJava.javacore.DConstrutores.test;

import MaratonandoJava.javacore.DConstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 23, "esporte", "Pierrot");
        anime.imprime();
    }
}
