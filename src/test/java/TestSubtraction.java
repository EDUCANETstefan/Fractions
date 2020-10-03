import org.junit.Assert;
import org.junit.Test;


public class TestSubtraction {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(10, 5);
        var result = fraction.minus(new NotImplementedFraction(2, 5));

        Assert.assertEquals((Integer) 8, result.getNumerator());
        Assert.assertEquals((Integer) 5, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(4, 2);
        var result = fraction.minus(new NotImplementedFraction(2, 2));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }


}
