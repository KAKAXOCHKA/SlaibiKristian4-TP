public class Hashtag {
    public static void main(String[] args){
        int height = 20;
        int weight = 50;
        Calculate(height,weight);
    }
    public static void Calculate(int a, int b){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
