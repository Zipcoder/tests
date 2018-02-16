import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class SecretTests {

    @Test
    public void testAdd() {
        int a = 2;
        int b = 2;
        int expected = 4;
        int actual = Calculator.add(a, b);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtract() {
        int a = 2;
        int b = 2;
        int expected = 3;
        int actual = Calculator.subtract(a, b);
    }

}
