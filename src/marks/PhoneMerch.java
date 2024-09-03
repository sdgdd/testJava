package marks;

public class PhoneMerch extends MerchandiseV2
{
    private String phoneName;
    private String cpuName;
    private String suppliers;
    public static int LIMIT_NUM=5;
    public PhoneMerch(String name, int count, double soldPrice, double purchasePrice,String phoneName,String cpuName,String suppliers) {
        super(name, count, soldPrice, purchasePrice);
        this.phoneName=phoneName;
        this.cpuName=cpuName;
        this.suppliers=suppliers;
    }

    @Override
    public void describe() {
        System.out.println("手机属性：手机型号"+phoneName+"cup 型号："+cpuName+"供应商："+suppliers);
        super.describe();
    }

    @Override
    public double buy(int count) {
        if(count>LIMIT_NUM){
            System.out.println("购买数量超出限制");
            return -2;
        }
        return super.buy(count);
    }

    public void selfAction(){
        System.out.println("手机商品私有函数，"+phoneName);
    }
}
