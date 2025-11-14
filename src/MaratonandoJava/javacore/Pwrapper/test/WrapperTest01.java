package MaratonandoJava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytep = 1;
        short shortp = 2;
        int intp = 3;
        long longp = 4;
        float floatp = 5;
        double doublep = 6;
        char charp = 7;
        boolean booleanp = false;

        Byte byteW = 127;
        Short shortW = 2;
        Integer intW = 3;
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6.0;
        Character charW = 7;
        Boolean booleanW = false;

        int i = intW;  //ja isso eh unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TRUE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}

