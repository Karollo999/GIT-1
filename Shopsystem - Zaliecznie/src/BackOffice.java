package shop;

import java.util.ArrayList;
import java.util.List;

public class BackOffice {
    private List<Product> products = new ArrayList<>();
    private List<Double> discounts = new ArrayList<>();
    private List<Order> finishedOrders = new ArrayList<>();

    // Metoda dodająca produkt do listy
    public void addProduct(Product product) {
        products.add(product);
    }

    // Metoda dodająca zniżkę do listy
    public void addDiscount(double discount) {
        discounts.add(discount);
    }

    // Metoda kończąca zamówienie i dodająca je do listy ukończonych zamówień
    public void finishOrder(Order order) {
        finishedOrders.add(order);
    }

    // Getters for lists
    public List<Product> getProducts() {
        return products;
    }

    public List<Double> getDiscounts() {
        return discounts;
    }

    public List<Order> getFinishedOrders() {
        return finishedOrders;
    }
}