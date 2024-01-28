package shop;

public class Order {
    private int id;
    private Cart cart;

    public Order(int id, Cart cart) {
        this.id = id;
        this.cart = cart;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }
}