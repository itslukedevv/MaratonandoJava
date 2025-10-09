package MaratonandoJava.javacore.Hheranca.test;

import MaratonandoJava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("aaaaa");


        /*
         * na heranca, primeiro sao carregadors os blocos de inicializacao
         * nesse codigo por exemplo carrega o BI static de pessoa, depois pula pro BI static de funcionario
         * depois carrega o BI de pessoa1 e depois o BI de pessoa2, se tivesse mais BI de pessoa ali
         * carregria mais dele.
         * por fim ele executa o construtor pessoa
         * e ai entra o BI de funcionario
         *  nota: crarrega sempre a classe PAI prmieiro.
         */

    }
}
