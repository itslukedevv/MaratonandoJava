package MaratonandoJava.introducaoi.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

         double salario = 6000;

         String tenhoCondicao = "eu vou doar 500 pro kevinho";
         String naoTenhoCondicao = "ainda nao posso doar";

         String resultado = salario >= 5000 ? tenhoCondicao : naoTenhoCondicao;

        System.out.println(resultado);
    }
}
