import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;
    public Bill(Customer customer){
        this.customer = customer;
    }

    public void addproducy(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
