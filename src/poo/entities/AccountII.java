package entities;

public class AccountII {

    public int number;
    public String holder;
    public double balance;

    public void deposit(double amount) {

        balance += amount;
    }

    public void withdraw(double amount) {

        balance -= amount + 5.0;
    }



    public String toString() {
        return number
                + ", "
                + holder
                + String.format(", $ %.2f", balance);
    }
}
