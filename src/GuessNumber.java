import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int startRange = 10;
        int endRange = 100;
        int subVal = endRange - startRange;
        int randNumber =(int)(startRange + Math.random() * subVal);

        int guessNumber = 5;

        System.out.println("the range is from " + startRange + " from " + endRange + "    " + randNumber);
        while (guessNumber>0){
            Scanner scaner = new Scanner(System.in);
            System.out.println("please input what you guess number");
            String str = scaner.nextLine();
            if(str.equals("q")){
                return;
            }
            if(Integer.parseInt(str) == randNumber){
                System.out.println("congrountion you win");
                return;
            }
            System.out.println("you dont guess right number");
            if((Integer.parseInt(str) > randNumber)){
                System.out.println("you number is big");
            }else {
                System.out.println("you number is small");
            }
            System.out.println("you has left " + --guessNumber +" chances");
        }
        System.out.println("you lost the game");
    }
}
