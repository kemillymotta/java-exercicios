package entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void setHolder(String holder) {

        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: "
                + String.format("$ %.2f", balance);
    }
}
