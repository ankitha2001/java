import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    public void testsub() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.add(4, 3));
    }
    @Test
    public void testmul() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.add(2, 3));
    }
    @Test
    public void testdiv() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(8, 4));
    }
}
