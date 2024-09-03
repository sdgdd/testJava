public class Shop {
    public String name;
    public double price;
    public String[] list;

    public double getPrice() {
        System.out.println(this.price);
        return price;
    }

    public String[] getList() {
        for (String s : this.list) {
            System.out.println(s);
        }
        return list;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }
}
