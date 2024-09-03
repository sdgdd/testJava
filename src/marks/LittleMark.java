package marks;

public class LittleMark {
        static String commonStr = "aaaa";

        private String superMarketName;
        private  String address;
        private int parkingCount;
        private double incomingSum;
        private MerchandiseV2[] merchandiseV2s;

        private int[] merchandiseSold;

        public static void showStatic(){
                System.out.println(LittleMark.commonStr);
        }

        static {
                commonStr="init";
        }
        public LittleMark( String address,String superMarketName,int parkingCount,int merchandiseCount){
                this.superMarketName=  superMarketName;
                this.address = address;
                this.parkingCount = parkingCount;
                this.incomingSum = 0;
                this.merchandiseV2s = new MerchandiseV2[merchandiseCount];
                for(int i=0;i<merchandiseCount;i++){
                        double purchasePrice = Math.random() * 200;
                        double soldPrice = purchasePrice * (1+Math.random());
                        MerchandiseV2 m = new MerchandiseV2("商品"+i,100,soldPrice,purchasePrice);

                        this.merchandiseV2s[i] = m;
                }
                this.merchandiseSold = new int[merchandiseCount];
        }

        public  void describe(){
                System.out.println("超市名字" + superMarketName + "，地址是" + address + "。 停车位剩余" + parkingCount
                        + "。总收入为" + incomingSum);
                System.out.println("商品详情");
                for(int i=0;i< this.merchandiseV2s.length;i++){
                        this.merchandiseV2s[i].describe();
                }
        }
        

}
