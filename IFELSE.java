import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args){
        System.out.println("Введите роль:");
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        System.out.println("Введите пароль:");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("Pov123456")){
            System.out.println("Вход выполнен как Админ!");
        } else if(role.equals("Vip") && pass.equals("Pov1")) {
            System.out.println("Вход выполнен как Вип клиент!");
        } else if(role.equals("User") && pass.equals("123456")) {
            System.out.println("Вход выполнен как клиент!");
        } else {
            System.out.println("Вход не выполнен!");
        }
    }
}
