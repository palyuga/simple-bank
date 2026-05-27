public class TransferService {
    public void transfer(Account from, Account to, double amount) {
        double commission = Math.min(amount * 0.01, 10.00);
        double totalToWithdraw = amount + commission;
        if (from.getBalance() < totalToWithdraw)
            throw new RuntimeException("Not enough funds");
        from.setBalance(from.getBalance() - totalToWithdraw);
        to.setBalance(to.getBalance() + amount);
    }
}
