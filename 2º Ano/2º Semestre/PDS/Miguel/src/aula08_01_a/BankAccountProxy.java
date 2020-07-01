package aula08_01_a;

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
        // Authorization (neste caso, como é apenas um exemplo, imaginamos que o Company.User
        // é uma chave de autenticação respetiva à conta a que está a tentar ser acedida)
        if (Company.user == User.OWNER) {
            return bankAccount.withdraw(amount);
        } else {
            throw new UnsupportedOperationException("ERROR WITHDRAW: You are not the account user!");
        }
    }

    @Override
    public double balance() {
        // Authorization (neste caso, como é apenas um exemplo, imaginamos que o Company.User
        // é uma chave de autenticação respetiva à conta a que está a tentar ser acedida)
        if (Company.user == User.OWNER) {
            return bankAccount.balance();
        } else {
            throw new UnsupportedOperationException("ERROR BALANCE: You are not the account user!");
        }
    }
}
