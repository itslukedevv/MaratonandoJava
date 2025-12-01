package MaratonandoJava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernTest02 {
    public static void main(String[] args) {
        //
        // \d - Todos os digitos
        // \D - Tudo que nao é digito
        // \s -  Espacos em branco \t \n \f \r
        // \S - Todos os caracteres excluindo os brancos
        // \w - vai retornar de tudo q for de a-z A-Z, digitos e _
        // \W - tudo oque nao for incluso no \w

        String regex = "\\W";
//      String text = "abaaba";
        String text2 = "f 231 !#@!#d _fgsd s1234";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  " +text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start()+ ": " + matcher.group()+"\n");
        }
    }
}
