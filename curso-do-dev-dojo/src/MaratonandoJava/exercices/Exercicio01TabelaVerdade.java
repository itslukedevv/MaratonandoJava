package MaratonandoJava.exercices;

public class Exercicio01TabelaVerdade {
    public static void main(String[] args) {

        double salario = 34.713;
        double imposto1 = 9.70 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;

        if (salario >= 0 && salario <= 34.712) {
            System.out.println("voce vai pagar 9.70% de imposto. ");
            System.out.println("E seu salario com o imposto descontado fica " + (salario - (salario * imposto1)));
        } else if (salario >= 34.713 && salario <= 68.507) {
            System.out.println("voce vai pagar 37.35% de imposto. ");
            System.out.println("E seu salario com o imposto descontado fica " + (salario - (salario * imposto2)));
        } else {
            System.out.println("voce vai pagar 49.50% de imposto. ");
            System.out.println("E seu salario com o imposto descontado fica " + (salario - (salario * imposto3)));
        }
    }
}
