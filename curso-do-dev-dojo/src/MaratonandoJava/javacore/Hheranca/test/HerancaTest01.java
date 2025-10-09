package MaratonandoJava.javacore.Hheranca.test;

import MaratonandoJava.javacore.Hheranca.dominio.Endereco;
import MaratonandoJava.javacore.Hheranca.dominio.Funcionario;
import MaratonandoJava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 1");
        endereco1.setCep("123131");

        Pessoa pessoa1 = new Pessoa("pessoa 1");
        pessoa1.setCpf("111.111.111-11");
        pessoa1.setEndereco(endereco1);

        pessoa1.imprime();

        System.out.println("--------------------");

        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        funcionario1.setCpf("111.111.754-41");
        funcionario1.setEndereco(endereco1);
        funcionario1.setSalario(1321312.2131);
        funcionario1.imprime();
    }
}
