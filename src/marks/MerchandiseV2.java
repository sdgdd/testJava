package marks;

public class MerchandiseV2 {
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;




    public  void describe(){
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public MerchandiseV2(String name,int count,double soldPrice,double purchasePrice){
        this.name= name;
        this.id=String.valueOf((int)(Math.random()*100000)) ;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public double calculateProfit(){
        return  this.soldPrice - this.purchasePrice;
    }

    public double buy(){
       return  buy(1);
    }
    public double buy(int count){
      return  buy(count,false);
    }
    public double buy(int count,boolean isVip){
        if(this.count - count<0){
            System.out.println("没有足够的库存");
            return -1;
        }
        this.count-=count;
        double cost = this.soldPrice;
        if(isVip){
             cost = this.soldPrice * 0.7;
        }
        return cost;
    }

}
