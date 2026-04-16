import java.util.Scanner;
import java.util.Random;

public class Kostki {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sum = 0;
        int numbers;
        int end = 1;
        while(end == 1) {
        System.out.println("Введите количество чисел (от 3 до 10): ");
        numbers = scanner.nextInt();

            if (numbers <= 10 && numbers >= 3) {
                int[] massive = new int[numbers];

                for (int i = 0; i < massive.length; i++) {
                    massive[i] = random.nextInt(6) + 1;
                    System.out.println("Айди " + (i + 1) + " Число " + massive[i]);
                }

                for (int i = 0; i < massive.length; i++) {
                    sum += massive[i];
                }
                System.out.println("Сумма чисел: " + sum);
                sum = 0;
                System.out.println("Сделать заново?: (1 продолжить/2 закончить)");
                end = scanner.nextInt();
            } else {
                System.out.println("Error");
            }
            for(int i = 0; i < 100; i++){
                System.out.println("");
            }
        } System.out.println("Конец игры!");
    }
}
