import java.util.Scanner;

public class littlegame {
    public static void main(String[] args){
        int money = 0;
        int dmg = 5;
        int bossHP = 5000;
        Scanner scanner = new Scanner(System.in);
        int choise;
        while (bossHP != 0) {
            System.out.println("Золото: " + money);
            System.out.println("Здоровье босса: " + bossHP);
            System.out.println("Атакуйте босса!");
            System.out.println("1 Атака");
            System.out.println("2 Магазин");

            choise = scanner.nextInt();
            if (choise == 1) {
                bossHP = bossHP - dmg;
                money = money + dmg;
                System.out.println("Вы нанесли боссу: " + dmg + " Урона");
            } else if (choise == 2) {
                System.out.println("Магазин");
                System.out.println("1 Топор(20 урона) стоимость 50 золота");
                System.out.println("2 Мечь(50 урона) стоимость 250 золота");
                System.out.println("3 Выход");
                int ShopChoise = scanner.nextInt();
                if (ShopChoise == 1 && money >= 50) {
                    System.out.println("Вы получили Топор на (20 урона)!");
                    dmg = 20;
                } else if (ShopChoise == 2 && money >= 250) {
                    System.out.println("Вы получили Мечь на (50 урона)!");
                    dmg = 50;
                } else {
                    System.out.println("Выход");
                }
            }
        }
        for (int i = 0; i < 100; i++){
            System.out.println();
        }
        System.out.println("Вы победили!");
    }
}
