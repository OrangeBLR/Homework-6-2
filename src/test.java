import java.util.Scanner;

public class test {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Количество элементов массива: ");
    int size = input.nextInt();
    int array[] = new int[size];
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();
    }
    System.out.print ("Ваш массив:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]);
    }
    System.out.println();
}
}