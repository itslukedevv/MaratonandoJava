package MaratonandoJava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;


    static {
        System.out.println("Dentro do bloco de inicializacao estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de funcionario 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicializacaode funcionario 2");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("SALARIO: "+this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + "recebi o salario no valor de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
