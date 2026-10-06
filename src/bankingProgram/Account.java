package bankingProgram;

public class Account {

    private int balance;
    private int pin;
    private String name;
    private int acctNumber;

    public Account(int pin, String name, int acctNumber){
        this.pin = pin;
        balance = 0;
        this.name = name;
        this.acctNumber = acctNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public int checkBalance(int pin) {

        if (this.pin == pin) {
            return balance;
        }
        else throw new IllegalArgumentException("Invalid Pin");
    }

    public void deposit(int amount, int acctNumber){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(int amount, int pin, int acctNumber) {
        if (this.pin == pin) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
        else { throw new IllegalArgumentException("Invalid Pin"); }
    }

}
