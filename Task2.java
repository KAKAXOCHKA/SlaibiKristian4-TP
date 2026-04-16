import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) { // записываем числа
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int index = 0;

        for(int i = 0; i < arr.length; i++) { // максимальное число
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Index = " + index + " Maximum = " + max);
    }
}
