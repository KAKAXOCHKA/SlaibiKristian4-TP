import java.util.Scanner;

public class funkcii {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int fnum;
        int snum;
        System.out.println("Введите певое число:");
        fnum = scanner.nextInt();
        System.out.println("Введите второе число:");
        snum = scanner.nextInt();
        int result = calculate(fnum,snum);
        System.out.println("Результат: "+result);
    }
    public static int calculate(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
}
