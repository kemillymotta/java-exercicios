package herancaPolimorfismo.exercicios.taxes;

public class Company extends Client {

    private int employees;

    public Company() {
    }

    public Company(String name, double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double taxes() {

        double basicTax = 0;
        if(getEmployees() < 10) {
            basicTax += getAnualIncome() * 0.16;
        } else {
            basicTax += getAnualIncome() * 0.14;
        }

        return basicTax;
    }

}
