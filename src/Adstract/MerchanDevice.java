package Adstract;

public class MerchanDevice {
    static public double discount=0.7;
    private String productName;
    private int inventory;

    private double soldPrice;

    private double salePrice;

    public MerchanDevice(String productName,int inventory,double soldPrice,double salePrice){
        this.productName=productName;
        this.inventory =inventory;
        this.soldPrice = soldPrice;
        this.salePrice = salePrice;
    }
    public double buy(){
        return buy(1);
    }
    public double buy(int count){
        return buy(1,false);
    }
    public double buy(int count,Boolean hasDiscount){
        if(count>this.inventory){
            System.out.println(this.productName+"库存不足");
            return -2;
        }
        this.inventory -=count;
        double payNum = count*this.salePrice;
        if(hasDiscount){
            return payNum*MerchanDevice.discount;
        }
        return  payNum;
    }

    public double getProfit(){
        return salePrice - soldPrice;
    }


    public static void setDiscount(double discount) {
        MerchanDevice.discount = discount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void describe(){
        System.out.println("商品名称"+this.productName+" 库存："+this.inventory+" 售价："+this.salePrice+" 进价："+this.soldPrice);
    }
}
