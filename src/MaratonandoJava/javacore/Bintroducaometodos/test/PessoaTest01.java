package MaratonandoJava.javacore.Bintroducaometodos.test;

import MaratonandoJava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
//      p1.nome = "Sasuke";
        p1.setNome("Sasuke");
        p1.setIdade(-2);
        p1.Imprime();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
