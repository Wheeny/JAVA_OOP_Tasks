package bankingProgram;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts =  new ArrayList<>();
    private int acctNumber = 324562001;

    public Bank(String name) {
        this.name = name;
    }

    public Account registerCustomer(String name, int pin){
        Account account = new Account(pin, name, acctNumber);
        acctNumber++;
        accounts.add(account);
        return account;
        }

    public Account findAccount(int acctNumber){
        for (Account account : accounts) {
            if (account.getAcctNumber() == acctNumber){
                return account;
            }
        }
        return null;
    }

    public void deposit(int amount, int acctNumber) {
        findAccount(acctNumber).deposit(amount, acctNumber);
    }


    public void withdraw(int amount, int pin, int acctNumber) {
        findAccount(acctNumber).withdraw(amount, pin, acctNumber);
    }


    public int checkBalance(int pin, int acctNumber) {

        Account account = findAccount(acctNumber);
        if (account == null) {
            throw new IllegalArgumentException("Invalid account number or PIN");
        }
        return account.checkBalance(pin);
    }


    public void transfer(int amount, int sender, int receiver, int pin) {
        withdraw(amount, pin, sender);
        deposit(amount, receiver);
    }


}
