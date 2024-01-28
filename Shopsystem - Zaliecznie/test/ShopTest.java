package shop;

public class ShopTest {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", "Dairy", 2.50, 0.07, 1);
        Product product2 = new Product("Bread", "Bakery", 1.50, 0.07, 2);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        Order order = new Order(1, cart);

        BackOffice backOffice = new BackOffice();
        backOffice.addProduct(product1);
        backOffice.addProduct(product2);

        backOffice.finishOrder(order);

        System.out.println("Total price: " + cart.calculateFinalPrice());
    }
}