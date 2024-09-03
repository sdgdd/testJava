import marks.MerchandiseV2;

import java.lang.reflect.Field;

public class TestClass {
    static public  void main(String[] args) throws NoSuchFieldException {
        MerchandiseV2 v= new MerchandiseV2("测试",10,100,80);

        Class clazz = v.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Field a = clazz.getField("soldPrice");
        System.out.println(a.getType());
    }
}
