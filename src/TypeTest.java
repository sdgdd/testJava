import marks.Category;
import marks.PhoneMerch;

import static marks.Category.FOOD;

public class TypeTest {
    public static void main(String[] args) {
//        PhoneMerch phoneM = new PhoneMerch("手机1",6,1000,900,"小米","骁龙888","联通");
//        phoneM.describe();
//        phoneM.buy(6);
//        phoneM.describe();
//      for(Category item:Category.values()){
//          System.out.println(item.toString());
//      }
        System.out.println(Category.valueOf("FOOD"));
//        System.out.println(Category.COOK);
    }
}
