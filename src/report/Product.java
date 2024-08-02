package report;
public class Product {
    private final String name;
    private final int    qty;
    private final double price;
    private final double total;

    public Product(String name, int qty, double price, double total) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

}
