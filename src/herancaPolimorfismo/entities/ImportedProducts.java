package herancaPolimorfismo.entities;

public class ImportedProducts extends Products {

    private Double customsFee;

    public ImportedProducts() {}

    public ImportedProducts(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }


}
