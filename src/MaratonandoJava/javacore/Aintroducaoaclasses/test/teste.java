package MaratonandoJava.javacore.Aintroducaoaclasses.test;

import MaratonandoJava.javacore.Aintroducaoaclasses.dominio.Estudante;

public class teste {
    public static void main(String[] args) {

        Estudante jean = new Estudante();

        jean.nome = "cachaca";
        jean.idade = 21;
        jean.sexo = 'M';

        System.out.println(jean.nome + " " + jean.sexo);

        Estudante maria = new Estudante();
        maria.nome = "maria";
        maria.idade = 22;
        maria.sexo = 'F';
        System.out.println(maria.nome + " " + maria.sexo);





    }
}
