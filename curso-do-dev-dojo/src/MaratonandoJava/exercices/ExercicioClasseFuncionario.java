package MaratonandoJava.exercices;

import MaratonandoJava.exercices.classesdosexericicos.Funcionario;
import MaratonandoJava.exercices.classesdosexericicos.metodoImprime;

public class ExercicioClasseFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Maratonando";
        funcionario.idade = 23;

        metodoImprime impressora = new metodoImprime();
        impressora.ImprimirDados(funcionario);

        impressora.ImprimirSalario(funcionario);
    }
}
