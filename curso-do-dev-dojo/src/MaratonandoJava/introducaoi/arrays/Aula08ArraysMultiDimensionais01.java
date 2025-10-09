package MaratonandoJava.introducaoi.arrays;

public class Aula08ArraysMultiDimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[1][1] = 1;

        for (int i = 1; i < dias.length; i++) {
            for (int j = 1; j < dias[i].length; j++) {
                 System.out.println(dias[i][j]);
            }
        }
        System.out.println("------------------------");
        for(int[] arrBase: dias) {
            for (int num: arrBase){
                System.out.print(num + " ");
            }
        }
    }
}
