public class TestMain {
    public static void main(String[] args) {
        System.out.println("test Main");

        for(String str :args){
            System.out.println(str);
        }

        StringBuilder strBut = new StringBuilder("asdf");
        strBut.append("234dsf").reverse();
        System.out.println(strBut.toString());
    }
}
