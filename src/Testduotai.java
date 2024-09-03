import marks.MerchandiseV2;
import marks.PhoneMerch;

public class Testduotai {


   public static  void main(String[] args) {
       MerchandiseV2[] merchArray = new MerchandiseV2[3];
       for(int i=0;i<merchArray.length;i++){
           if(i%2==0){
               merchArray[i] =  new MerchandiseV2("手机商品"+i,20,200,180);
           }else {
               merchArray[i] =new PhoneMerch("手机"+i,10,100,80,"小米手机"+i,"小龙","联通");
           }
       }

       for(MerchandiseV2 tmp:merchArray){
           tmp.describe();
       }
   }
}
