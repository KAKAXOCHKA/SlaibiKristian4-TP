import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        System.out.println("Введи имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введи фамилию: ");
        String s_name = scanner.nextLine();
        System.out.println("Ваше имя и фамилия: " + name + " " + s_name + " Записаны в базу данных");
    }
}
