import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int N = in.nextInt();
        System.out.print("Количество столбцов: ");
        int M = in.nextInt();
        int[][] array = new int[N][M];
        int s = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println ();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = s++;
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
        }
    }
}