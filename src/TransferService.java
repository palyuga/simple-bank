public class TransferService {
    public void transfer(Account from, Account to, double amount) {
        if (from.getBalance() < amount)
            throw new RuntimeException("Not enough funds");
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }
}
