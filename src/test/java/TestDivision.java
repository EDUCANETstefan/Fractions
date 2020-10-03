import org.junit.Assert;
import org.junit.Test;


public class TestDivision {

    @Test
    public void testSimple() {
        var fraction = TestUtils.createFraction(3, 6);
        var result = fraction.dividedBy(new NotImplementedFraction(3, 5));

        Assert.assertEquals((Integer) 15, result.getNumerator());
        Assert.assertEquals((Integer) 18, result.getDenominator());
    }

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(4, 4);
        var result = fraction.dividedBy(new NotImplementedFraction(8, 8));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }


}