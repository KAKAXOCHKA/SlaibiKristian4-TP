import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[4];

        // Ввод массива
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }

        // Сортировка (bubble sort)
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j < massive.length - i - 1; j++) {
                if (massive[j] > massive[j + 1]) {
                    int temp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = temp;
                }
            }
        }

        // Вывод
        for (int num : massive) {
            System.out.print(num + " ");
        }
    }
}