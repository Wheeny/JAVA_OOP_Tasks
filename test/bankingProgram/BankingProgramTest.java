package bankingProgram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankingProgramTest {

    private BankingProgram bank;

    @BeforeEach
    public void setUp(){
        bank = new BankingProgram(1234);
    }


    @Test
    public void testThatAnAccountExistsWithZeroBalance(){

        int expected = 0;
        int actual = bank.checkBalance(1234);

        assertEquals(expected, actual);
    }


    @Test
    public void testThatTheAccountBalanceIsCheckedWithTheWrongPin(){

        assertThrows(IllegalArgumentException.class, () -> bank.checkBalance(124));
    }

    @Test
    public void testThatAnAccountExistsWithZeroBalance_AndTheBalanceChangesAfterDepositIsMade(){

        bank.deposit(200);
        int expected = 200;
        int actual = bank.checkBalance(1234);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatAnAccountExistsWithZeroBalance_AndTheBalanceDoesNotChangeAfterNegativeDepositIsMade(){

        bank.deposit(-200);
        int expected = 0;
        int actual = bank.checkBalance(1234);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatAnAccountExistsWithZeroBalance_AndTheBalanceChangesAfterDepositAndWithdrawalsAreMade(){

        bank.deposit(1000);
        bank.withdraw(500, 1234);
        int expected = 500;
        int actual = bank.checkBalance(1234);

        assertEquals(expected, actual);
    }


    @Test
    public void testThatAnAccountExistsWithZeroBalance_AndTheBalanceChangesAfterDeposit_AndNegativeWithdrawalsAreAttempted(){

        bank.deposit(1000);
        bank.withdraw(-2000, 1234);
        int expected = 1000;
        int actual = bank.checkBalance(1234);

        assertEquals(expected, actual);
    }


    @Test
    public void testThatAnAccountExistsWithZeroBalance_TheBalanceChangesAfterDeposit_AndWithdrawalIsMadeWithTheWrongPin(){

        assertThrows(IllegalArgumentException.class, () -> bank.withdraw(500, 124));
    }

}



