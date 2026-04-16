import java.util.Scanner;

public class swich {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First: ");
        int a = scanner.nextInt();
        System.out.println("Second: ");
        int b = scanner.nextInt();
        System.out.println("What to do?: ");
        scanner.nextLine();
        String Simbol = scanner.nextLine();
        switch (Simbol){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
        }
    }
}
