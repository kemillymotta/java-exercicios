package entities;

public class AccountT {

    private int number;
    private String holder;
    private double balance;

    public AccountT(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public AccountT() {
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public void transfer (AccountT account, double amount) {
        account.deposit(amount);
        withdraw(amount);
}

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String toString() {
        return String.format("Number: %d, Holder: %s, Balance: %.2f", number, holder, balance);
    }
}
