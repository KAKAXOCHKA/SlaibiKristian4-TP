import java.util.Scanner;

public class Prakt {
    public static void main(String[] args){
        int[] massive = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа: ");

        for(int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }

        for(int i = 0; i < massive.length - 1; i++) {
            for(int j = 0; j < massive.length - i - 1; j++) {
                if(massive[j] > massive[j + 1])
                {
                    int remember = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = remember;
                }
            }
        }

        for(int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}
