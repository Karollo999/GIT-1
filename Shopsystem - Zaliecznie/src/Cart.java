package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private double discount;

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Metoda obliczająca ostateczną cenę zamówienia
    public double calculateFinalPrice() {
        double finalPrice = products.stream().mapToDouble(Product::calculateFinalPrice).sum();
        finalPrice -= discount;
        return finalPrice > 0 ? finalPrice : 0;
    }
}