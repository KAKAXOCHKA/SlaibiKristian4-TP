public class gametry {
    public static void main(String[] args){
        int height = 10;
        int width = 40;
        int from = 1;
        int to = 8;

        String[][] setka = new String[height][width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                setka[i][j] = "*";
            }
        }

        int row1 = 5;
        for(int g = from; g <= to; g++){
            setka[g][row1] = "|";
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(setka[i][j]);
            }
            System.out.println();
        }

    }
}
