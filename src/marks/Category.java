package marks;

public enum Category {
    FOOD(1),
    COOK(2);
    private int id;

    private Category(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{"+"id="+id+"}";
    }

}
