import AI.Ai;
import marks.LittleMark;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

//        LittleMark myMarks =new LittleMark("上海市浦东新区","红尘超市",100,10);
//        myMarks.describe();
//        LittleMark.showStatic();

//        Shop m1 = new Shop();
//        m1.list = new String[]{"apple","banana"};
//        m1.name="wanni";
//        m1.getName();
//        m1.price=123123;
//        m1.getPrice();
//        m1.getList();
        Scanner scanner = new Scanner(System.in);
        String str;
        Ai smallQa = new Ai();
        while (true){
            str = scanner.nextLine();
            if(str.toLowerCase().equals("exit")){
                System.out.println("bye");
                return;
            }
            System.out.println(smallQa.answer(str));
        }


    }
}
