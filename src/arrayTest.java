public class arrayTest {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1]= 40;
        System.out.println(myIntArray[0]);

        String[][] arrayer = new String[10][10];

        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
            arrayer[i][j] =(String) (i+" "+j);
            }
        }

        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.println(arrayer[i][j]);
            }
        }

    }
}
