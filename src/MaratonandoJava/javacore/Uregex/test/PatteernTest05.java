package MaratonandoJava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatteernTest05 {
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
        // . 1.3 =123,133,1@3, 1A3


        //String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String regex = "([a-z0-9\\._-])+@(\\w)+(\\.([a-z0-9\\._-])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
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
