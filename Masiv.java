import java.util.Scanner;

public class Masiv {
    public static void main (String[] args){
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            System.out.print("Введите число:");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Миннимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }
}
