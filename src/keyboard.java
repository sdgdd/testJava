import java.math.BigInteger;
import java.util.Scanner;

public class keyboard {
    public static void main(String[] args) {
//        for(int i = 0;i<10;i++){
//            System.out.println((int) Math.floor(Math.random()*100));
//        }
//
//        Scanner in = new Scanner(System.in);
//        BigInteger num = in.nextBigInteger();
//        System.out.println("first num"+num);
//        BigInteger num2 = in.nextBigInteger();
//        System.out.println(num.add(num2));

        String str = "apple_banana_watermelon";


        System.out.println(str.toUpperCase());
        String[] strArry = str.split("_");
        for(String strs : strArry){
            System.out.println(strs);
        }

        char[] chars = str.toCharArray();
        for(char ch : chars){
            System.out.println(ch);
        }

    }
}
