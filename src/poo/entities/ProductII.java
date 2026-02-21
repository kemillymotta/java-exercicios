package entities;

public class ProductII {

    public String name;
    public double price;
    public int quantity;


    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts (int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return String.format("Name: %s%nPrice: %.2f%nQuantity: %d%nTotal value: %.2f", name, price, quantity, totalValueInStock());
    }
}
