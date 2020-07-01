package aula08_01_b;

public interface BankAccount {
    void deposit(double amount);

    boolean withdraw(double amount);

    double balance();
}
