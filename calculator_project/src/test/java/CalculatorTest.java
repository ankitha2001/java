import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        System.out.println("Addition result: "+result);
        assertEquals(5,result);
    }
    @Test
    public void testsub() {
        Calculator calc = new Calculator();
        int result = calc.sub(8,4);
        System.out.println("Subtraction result: "+result)
        assertEquals(4,result);
    }
    @Test
    public void testmul() {
        Calculator calc = new Calculator();
        int result = calc.mul(2,3)
        System.println.out("Multiplication result: "+result)
        assertEquals(6,result);

    }
    @Test
    public void testdiv() {
        Calculator calc = new Calculator();
        int result = calc.mul(8,4)
        System.println.out("Division result: "+result)
        assertEquals(4,result);
    }
}
