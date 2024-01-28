package shop;

public class Product {
    private String name;
    private String category;
    private double price;
    private double tax;
    private double discount;
    private int id;

    public Product(String name, String category, double price, double tax, int id) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.tax = tax;
        this.id = id;
        this.discount = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public int getId() {
        return id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Metoda obliczająca ostateczną cenę produktu
    public double calculateFinalPrice() {
        double finalPrice = price + (price * tax) - discount;
        return finalPrice > 0 ? finalPrice : 0;
    }
}