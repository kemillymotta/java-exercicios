package listas.entities;

public class Accounts {

    private Integer id;
    private String holder;
    private Double balance;

    public Accounts(Integer id, String holder, Double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
