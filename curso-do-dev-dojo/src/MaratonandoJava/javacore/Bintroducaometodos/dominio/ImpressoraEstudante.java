package MaratonandoJava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudantes) {
        System.out.println("-----------------");
        estudantes.nome = "Gohan";

        System.out.println(estudantes.nome);
        System.out.println(estudantes.idade);
        System.out.println(estudantes.sexo);
    }
}
