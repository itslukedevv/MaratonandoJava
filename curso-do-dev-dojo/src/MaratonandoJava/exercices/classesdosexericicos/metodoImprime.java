package MaratonandoJava.exercices.classesdosexericicos;

public class metodoImprime {
    public void ImprimirDados(Funcionario funcionario) {
        System.out.println("-----------------");
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
    }

    public void ImprimirSalario(Funcionario funcionario) {

        double salarioTotal = funcionario.salario1 + funcionario.salario2 + funcionario.salario3;

        double mediaSalario = salarioTotal / 3;

        System.out.println("salario 1: " + funcionario.salario1);
        System.out.println("salario 2: " + funcionario.salario2);
        System.out.println("salario 3: " + funcionario.salario3);
        System.out.println("Media do salario: " + mediaSalario);
    }
}
