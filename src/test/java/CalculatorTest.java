import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddMehod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 20), 30, "Looks like an error :)");
    }
    @Test
    public void testSubtractMethod(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(20, 5), 15);
    }
    @Test
    public void testDivideMethod(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(10, 5), 2);
    }
    @Test
    public void testMultiplyMethod(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(20, 5), 100);
    }}
