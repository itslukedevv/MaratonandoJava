package MaratonandoJava.exercices1;

public class For {
    public static void main(String[] args) {
        int n = 24;

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}



//Se N é ímpar → print “Weird”
//
//Se N é par e está entre 2 e 5 → print “Not Weird”
//
//Se N é par e está entre 6 e 20 → print “Weird”
//
//Se N é par e maior que 20 → print “Not Weird”