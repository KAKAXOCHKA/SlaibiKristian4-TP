import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int[] massive = new int[6]; // сам массив
        int random;

        for (int i = 0; i < massive.length; i++) { // цыкл для рандома
            random = (int) (Math.random() * massive.length) + 1;
            massive[i] = random;
            System.out.print(massive[i] + " ");
        }
    }
}
