package MaratonandoJava.javacore.Gassociacao.test;

import MaratonandoJava.javacore.Gassociacao.domain.Jogador;
import MaratonandoJava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time selecaoBrasileira = new Time("Selecao brasileira");

        jogador1.setTime(selecaoBrasileira);

        jogador1.imprime();
    }
}
