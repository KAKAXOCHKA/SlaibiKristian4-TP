public class Midlechislo {
    public static void main(String[] args) {
        int[] marks = new int[]{4, 4, 4, 4, 4, 4, 3, 4, 3, 4, 4, 4, 4, 4, 5, 4, 6, 4, 1, 4};
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double middle = sum / marks.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + middle);

        if (middle >= 5.75) {
            System.out.println("Итоговая Оценка 6");
        } else if (middle >= 4.75) {
            System.out.println("Итоговая Оценка 5");
        } else if (middle >= 3.75) {
            System.out.println("Итоговая Оценка 4");
        } else {
            System.out.println("Итоговая Оценка 3");
        }

        int max = marks[0]; //максимум

        for (int i = 1; i < marks.length; i++) {
                if(marks[i] > max){
                    max = marks[i];
                }
        }
        System.out.println("Максимальная оценка " +max);

        int min = marks[0]; // миннимум

        for (int i = 1; i < marks.length; i++) {
            if(marks[i] < min){
                min = marks[i];
            }
        }
        System.out.println("Минимальная оценка " +min);

        // сортировка
        int memory = marks[0];
        for(int i = 0; i < marks.length - 1; i++){
            for(int j = 0; j < marks.length - 1 - i; i++){

            }
        }
    }
}
