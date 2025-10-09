package MaratonandoJava.javacore.Aintroducaoaclasses.test;

import MaratonandoJava.javacore.Aintroducaoaclasses.dominio.Estudante;
import MaratonandoJava.javacore.Aintroducaoaclasses.dominio.Professor;

public class testprofessorestu {
    public static void main(String[] args) {

        Estudante jean = new Estudante();

        jean.nome = "Jean";
        jean.idade = 20;

        Professor girafa = new Professor();

        girafa.nome = "Girafa";
        girafa.idade = 40;
        girafa.rg = 1231231;
    }
}
