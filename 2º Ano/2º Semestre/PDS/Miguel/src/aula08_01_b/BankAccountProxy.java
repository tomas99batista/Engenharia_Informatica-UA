package aula08_01_b;

public class BankAccountProxy implements BankAccount {
    private BankAccount bankAccount;

    public BankAccountProxy(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (Company.user == User.OWNER) {
            return bankAccount.withdraw(amount);
        } else {
            throw new UnsupportedOperationException("ERROR WITHDRAW: You are not the account user!");
        }
    }

    @Override
    public double balance() {
        if (Company.user == User.OWNER) {
            return bankAccount.balance();
        } else {
            throw new UnsupportedOperationException("ERROR BALANCE: You are not the account user!");
        }
    }
}
