
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int result = Calculator.calculate(2, 3, '+');
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = Calculator.calculate(5, 2, '-');
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testMultiply() {
        int result = Calculator.calculate(5, 2, '*');
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testDiv() {
        int result = Calculator.calculate(6, 2, '/');
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testUnexpectedOperand() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> Calculator.calculate(6, 2, '.'));
    }

}
