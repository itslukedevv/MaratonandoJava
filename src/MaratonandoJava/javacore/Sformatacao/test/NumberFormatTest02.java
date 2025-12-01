package MaratonandoJava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1000.2130;
        for (NumberFormat nf : nfa) {
            System.out.println(nf.getMaximumFractionDigits());
            System.out.println(nf.format(valor));
        }
        String valorString = "1.000,21 ¤";
        try {
            System.out.println(nfa[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
