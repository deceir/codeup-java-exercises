public class Groceries {

    private String name;
    private String category;
    private int quantity;

    public Groceries(String category, String name, int quantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
