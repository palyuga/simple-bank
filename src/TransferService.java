public class TransferService {
    ExchangeRateService exchangeRateService;

    // amount is always in the 'from' account currency
    public void transfer(Account from, Account to, double amount) {
        if (from.getBalance() < amount)
            throw new RuntimeException("Not enough funds");
        from.setBalance(from.getBalance() - amount);
        double exchangeRate = exchangeRateService.getExchangeRate(from.getCurrency(), to.getCurrency());
        to.setBalance(to.getBalance() + amount * exchangeRate);
    }
}
