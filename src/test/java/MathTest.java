import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    public void testFactorial() {
        assertEquals(1, Math.factorial(0));
        assertEquals(1, Math.factorial(1));
        assertEquals(2, Math.factorial(2));
        assertEquals(6, Math.factorial(3));
        assertEquals(24, Math.factorial(4));
    }

    @Test
    public void testSign() {
        assertEquals(1, Math.sign(5));
        assertEquals(-1, Math.sign(-5));
        assertEquals(0, Math.sign(0));
    }
}