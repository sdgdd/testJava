package coms;

import coms.fire.Cpu;
import coms.fire.Other;

public class Maker {
    public static void main(String[] args) {
        Product[] product = new Product[2];
        for(int i = 0;i<product.length;i++){
            Product tmp= new Product();
            tmp.myCpu=new Cpu();
            tmp.myCpu.name="i am in "+i;

            tmp.myOther= new Other();
            tmp.myOther.tmp="asfasdf "+i;
            product[i] = tmp;
        }

        Product pord = new Product();
        pord.ChangeMyCpu(product[0].myCpu);
        System.out.println(pord.myCpu.name);


        product[0].myCpu.name = "i has change";
        System.out.println(" product[0].myCpu.name");
        System.out.println(pord.myCpu.name);

//        for (int i = 0; i < product.length; i++) {
//            System.out.println(product[i].myCpu.name);
//            System.out.println(product[i].myOther.tmp);
//        }
    }
}
