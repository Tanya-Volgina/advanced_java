import org.example.Calculator.ICalculator;
import org.example.Exceptions.InvalidSignException;
import org.junit.Assert;
import org.junit.Test;
import org.example.Calculator.Calculator;
import org.example.Common.Expression;

public class test {
    private double delta = 0.001;
    private ICalculator calculator = new Calculator();

    @Test
    public void calculatePlus() throws Exception {
        var expression = new Expression(-1, 6, "+");

        var actual = calculator.calculate(expression);

        Assert.assertEquals(5, actual, this.delta);
    }

    @Test
    public void calculateMinus() throws Exception {
        var expression = new Expression(10, 1, "-");

        var actual = calculator.calculate(expression);

        Assert.assertEquals(9, actual, this.delta);
    }

    @Test
    public void calculateMultiply() throws Exception {
        var expression = new Expression(10, -2, "*");

        var actual = calculator.calculate(expression);

        Assert.assertEquals(-20, actual, this.delta);
    }

    @Test
    public void calculateDivision() throws Exception {
        var expression = new Expression(55, 11, "/");

        var actual = calculator.calculate(expression);

        Assert.assertEquals(5, actual, this.delta);
    }

    @Test
    public void exceptionDividingZero() {
        var expression = new Expression(1, 0, "/");

        Assert.assertThrows(ArithmeticException.class, () -> calculator.calculate(expression));
    }

    @Test
    public void exceptionIncorrectSign() {
        var expression = new Expression(1, 1, ":");

        Assert.assertThrows(InvalidSignException.class, () -> calculator.calculate(expression));
    }
}
