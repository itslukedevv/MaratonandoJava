package MaratonandoJava.exercices;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        double valorDoCarro = 50000;

        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valordaparcela = valorDoCarro / parcela;
            if (valordaparcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + " = " + valordaparcela);
        }
    }
}
