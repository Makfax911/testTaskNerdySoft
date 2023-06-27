import java.util.List;
public class Order {
    User user;
    List<Product> products ;
    public Order(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    public static Order createOrder(User user, List<Product> products) {
        return new Order(user,products);
    }

    public Order(OrderBuilder  ob) {
        this.user = ob.user;
        this.products = ob.products;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user.name +
                '}';
    }
    public static class OrderBuilder {
        User user;
        List<Product> products;
        public OrderBuilder() {
        }

        public OrderBuilder(User user, List<Product> products) {
            this.user = user;
            this.products = products;
        }
        public OrderBuilder withUser(User user){
            this.user = user;
            return this;
        }

        public OrderBuilder withProducts(List<Product> products){
            this.products = products;
            return this;
        }
        public  Order build(){
            return new Order(this);
        }
    }
}
