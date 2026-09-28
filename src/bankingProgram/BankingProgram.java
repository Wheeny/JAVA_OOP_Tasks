package bankingProgram;

public class BankingProgram {

    private int balance;
    private int pin;

    public BankingProgram (int pin){
        this.pin = pin;
    }

    public int checkBalance(int pin) {

        if (this.pin == pin) {
            return balance;
        }
        else throw new IllegalArgumentException("Invalid Pin");
    }

    public void deposit(int deposited_amount){
        if(deposited_amount > 0){
            balance += deposited_amount;
        }
    }

    public void withdraw(int withdrawn_amount, int pin) {
        if (this.pin == pin) {
            if (withdrawn_amount > 0 && withdrawn_amount <= balance) {
                balance -= withdrawn_amount;
            }
        }
        else { throw new IllegalArgumentException("Invalid Pin"); }
    }

}
