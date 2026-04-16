public class Task {
    public static void main(String[] args){
        int[] massive = new int[] {1,2,3,4,5};

        double sum = 0;

        for(int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }

        double average = sum / massive.length;

        for(int i = 0; i < massive.length; i++) {
            if (massive[i] > average) {
                System.out.println(massive[i]);
            }
        }
    }
}
