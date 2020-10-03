import org.junit.Assert;
import org.junit.Test;


public class TestMultiplication {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(3, 5);
        var result = fraction.times(new NotImplementedFraction(3, 5));

        Assert.assertEquals((Integer) 6, result.getNumerator());
        Assert.assertEquals((Integer) 25, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(5, 2);
        var result = fraction.times(new NotImplementedFraction(4, 2));

        Assert.assertEquals((Integer) 5, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }


}