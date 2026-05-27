public class Account {
    long id;
    double balance;
    Currency currency;

    public Account(long id, double balance, Currency currency) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
