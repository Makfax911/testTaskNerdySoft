import java.time.LocalDate;
import java.util.Objects;
class ProductFactory{
    static ProductReal createRealProduct(String productA, double v, int i, int i1){
        return new ProductReal(productA,v,i,i1);
    }
    static ProductVirtual createVirtualProduct(String productC, double i, String xxx, LocalDate of){
        return new ProductVirtual(productC, i, xxx, of);
    }
}

class Product {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class ProductReal extends Product{
    double size;
    int weight;

    public ProductReal(String name, double price, double size, int weight) {
        super(name, price);
        this.size = size;
        this.weight = weight;
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
class ProductVirtual  extends Product{
    String code ;
    LocalDate expirationDate;
    public ProductVirtual(String name, double price,String code, LocalDate expirationDate) {
             super(name, price);
             this.code = code;
             this.expirationDate = expirationDate;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}