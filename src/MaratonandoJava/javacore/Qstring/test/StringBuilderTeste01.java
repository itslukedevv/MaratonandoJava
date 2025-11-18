package MaratonandoJava.javacore.Qstring.test;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat("DevDojo");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" DevDojo").append(" Academy").append("|");
        sb.substring(0, 2);
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
