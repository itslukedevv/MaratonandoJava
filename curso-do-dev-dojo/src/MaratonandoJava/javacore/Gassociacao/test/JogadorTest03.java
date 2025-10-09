package MaratonandoJava.javacore.Gassociacao.test;

import MaratonandoJava.javacore.Gassociacao.domain.Jogador;
import MaratonandoJava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time1 = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);

        time1.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador1.imprime();

        System.out.println("--- TIME ---");

        time1.imprime();

    }
}
