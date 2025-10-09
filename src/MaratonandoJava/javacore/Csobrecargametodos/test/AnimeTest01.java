package MaratonandoJava.javacore.Csobrecargametodos.test;

import MaratonandoJava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One piece 2", "TV", 12, "Shonen");
        anime.imprime();
    }
}
