package MaratonandoJava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "             Luffy             ";
        String n = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.replace("f", "r"));
        System.out.println(n.length());
        System.out.println(n.substring(3,n.length()));
        System.out.println(nome.trim());
    }
}
