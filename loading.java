public class loading {
    public static void main(String[] args) {
        int loading = 100;

        for (int i = 0; i <= loading; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.print("\r" + i + "%");
        }
        System.out.println("\r" + "Wellcome to game!");
    }
}