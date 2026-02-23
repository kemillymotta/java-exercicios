package revisao2002.entities;

public class Products {

    private String product;
    private int code;
    private double price;

    public Products(String product, int code, double price) {
        this.product = product;
        this.code = code;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
