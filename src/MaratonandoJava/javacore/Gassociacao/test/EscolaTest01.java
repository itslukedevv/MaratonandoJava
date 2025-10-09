package MaratonandoJava.javacore.Gassociacao.test;

import MaratonandoJava.javacore.Gassociacao.domain.Escola;
import MaratonandoJava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Girafales sensei");
        Professor professor2 = new Professor("kakashi sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola1 = new Escola("chaves", professores);

        escola1.imprime();


    }
}
