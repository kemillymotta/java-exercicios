package entities;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (netSalary()  * (percentage / 100));
    }

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String toString() {
        return "Name: "
                + name
                + ", Net salary: "
                + String.format("%.2f", netSalary());
    }
}
