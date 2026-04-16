import java.util.Scanner;

public class Masivky {
    public static void main(String[] args){
//        int[] massive = new int[5];
//        massive[0] = 5;
//        massive[1] = 7;
//        massive[2] = 2;
//        massive[3] = 1;
//        massive[4] = 15;
//        int result = massive[2] + massive[4];
//        System.out.println(result);
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Введите число: ");
            int value = scanner.nextInt();
            numbers[i] = value;
        }
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
            System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
