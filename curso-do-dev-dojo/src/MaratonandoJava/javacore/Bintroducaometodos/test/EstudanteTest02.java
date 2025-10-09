package MaratonandoJava.javacore.Bintroducaometodos.test;

import MaratonandoJava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        Estudante cleber = new Estudante();

        joao.nome = "Joao";
        joao.idade = 23;
        joao.sexo = 'M';

        cleber.idade = 22;
        cleber.nome = "Cleber";
        cleber.sexo = 'M';

        joao.imprimir();
        cleber.imprimir();

    }
}
