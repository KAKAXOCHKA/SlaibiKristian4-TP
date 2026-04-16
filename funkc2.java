public class funkc2 {
    public static void main(String[] args){
        byte[] numbers = new byte[] {5,1,6,8,4,7,3};
        int result = ArraySum(numbers);

        System.out.println(result);
    }
    public static int ArraySum(byte[] arr){
        int sum = 0;

        for(byte i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
