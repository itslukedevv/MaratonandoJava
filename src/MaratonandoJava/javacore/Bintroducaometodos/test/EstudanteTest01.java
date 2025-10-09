package MaratonandoJava.javacore.Bintroducaometodos.test;

import MaratonandoJava.javacore.Bintroducaometodos.dominio.Estudante;
import MaratonandoJava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        Estudante cleber = new Estudante();
        ImpressoraEstudante imp = new ImpressoraEstudante();

        joao.nome = "Joao";
        joao.idade = 23;
        joao.sexo = 'M';

        cleber.idade = 22;
        cleber.nome = "Cleber";
        cleber.sexo = 'M';

        imp.imprime(joao);
        imp.imprime(cleber);
    }
}
