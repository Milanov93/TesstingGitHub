package Test;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;
    private double balace  = 0-6d;


    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        Assert.assertEquals(0d, account.getBalance(), balace);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
}