package Adstract;

import org.w3c.dom.CDATASection;

import java.util.Date;

public class Phone extends MerchanDevice implements LimitTimeDev,VirtualDevice
{
    private Date startTime;
    private long gapTime;

    private String virtualNum;

    public Phone(String productName,int inventory,double soldPrice,double salePrice,Date startTime,long gapTime,String virtualNum){
        super(productName,inventory,soldPrice,salePrice);
        this.gapTime=gapTime;
        this.startTime = startTime;
        this.virtualNum = virtualNum;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("出厂时间："+startTime+" 保质期："+gapTime+" 设备编号"+virtualNum);
    }

    @Override
    public long getLeftTime() {
        Date now = new Date();
        return now.getTime() - startTime.getTime();
    }

    @Override
    public boolean isExpired() {
        return this.gapTime - getLeftTime()>0;
    }

    @Override
    public void setStartAndGap(Date date, long gapTime) {
        this.startTime = date;
        this.gapTime = gapTime;
    }

    @Override
    public String getVirtualNumber() {
        return this.virtualNum;
    }

    @Override
    public void setVirtualNumber(String num) {
        this.virtualNum = num;
    }
}
