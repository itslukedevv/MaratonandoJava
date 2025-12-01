package MaratonandoJava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernTest04 {
    public static void main(String[] args) {
        //
        // \d - Todos os digitos
        // \D - Tudo que nao é digito
        // \s -  Espacos em branco \t \n \f \r
        // \S - Todos os caracteres excluindo os brancos
        // \w - vai retornar de tudo q for de a-z A-Z, digitos e _
        // \W - tudo oque nao for incluso no \w
        // [] - da pra escolher oq vai vir de retorno
        // ? Zero ou uma ocorrencias
        // * Zero ou mais ocorrencias
        // + uma ou mais ocorrencias
        // {n,m} de n ate m
        // () agrupamento
        // | ou
        // achar uma palavra | o (v|c) o ovo ou oco
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start()+ ": " + matcher.group()+"\n");
        }
    }
}
