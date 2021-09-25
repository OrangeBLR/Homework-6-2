import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        maxValue();
        System.out.println();
        minValue();
    }

    /**Вычисляет максимальное значение из введённого пользователем массива
     *
     */
    static void maxValue() {
        int [] arr3 = createArray();
        int max = arr3[0];
        for(int i = 0; i<arr3.length; i++){
            if(max<arr3[i])
                max = arr3[i];
        }
        System.out.println("Максимальное значение: "+max);
    }

    /**Вычисляет минимальное значение из введённого пользователем массива
     *
     */
    static void minValue() {
        int [] arr3 = createArray();
        int min = arr3[0];
        for(int i = 0; i<arr3.length; i++){
            if(min>arr3[i])
                min = arr3[i];
        }
        System.out.println("Минимальное знаение:"+min);
    }


    /**
     * Создаёт массив введённого пользователем размера
     *
     * @return новый массив с элементами, введёнными пользователем
     */
    static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}
