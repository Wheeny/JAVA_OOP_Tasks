package bankingProgram;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank bank;
    @BeforeEach
    public void setUp(){
        bank = new Bank("Jaiz");
    }


    @Test
    public void testToFindaRegisteredCustomersDetails(){
        bank.registerCustomer("Dan", 1234);
        bank.registerCustomer("Winifred", 5678);
        Account account = bank.findAccount(324562002);
        assertEquals(account.getName(), "Winifred");
    }

    @Test
    public void testThatTheRegisteredCustomersAccountBalanceChangesAfterDepositIsMade(){

        bank.registerCustomer("Winifred", 5678);
        Account account = bank.findAccount(324562001);
        bank.deposit(200, 324562001);
        int expected = 200;
        int actual = bank.checkBalance(5678, 324562001);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatTheRegisteredCustomersAccountBalanceChangesAfterDepositAndWithdrawalsAreMade() {

        bank.registerCustomer("Winifred", 5678);
        Account account = bank.findAccount(324562001);
        bank.deposit(1000, 324562001);
        bank.withdraw(500, 5678, 324562001);
        int expected = 500;
        int actual = bank.checkBalance(5678, 324562001);

        assertEquals(expected, actual);

    }


    @Test
    public void testThatMoneyCanBeTransferredFromOneAccountToAnother() {
        bank.registerCustomer("Winifred", 5678);
        bank.registerCustomer("Dan", 1234);

        bank.deposit(2000, 324562001);
        bank.transfer(500, 324562001, 324562002, 5678);

        int senderActualBalance = bank.checkBalance(5678, 324562001);
        int receiverActualBalance = bank.checkBalance(1234, 324562002);

        assertEquals(1500, senderActualBalance);
        assertEquals(500, receiverActualBalance);
    }


}
