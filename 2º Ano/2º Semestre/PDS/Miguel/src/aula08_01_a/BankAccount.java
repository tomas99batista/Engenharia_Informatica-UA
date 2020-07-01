package aula08_01_a;

public interface BankAccount {
    void deposit(double amount);

    boolean withdraw(double amount);

    double balance();
}
