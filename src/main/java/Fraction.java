public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }



    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int resultNum;
        int resultDom;

        if (getDenominator().equals(other.getDenominator())) {
            resultNum = getNumerator() + other.getNumerator();
            resultDom = getDenominator();
        }
        else {
            resultDom = getDenominator() * other.getDenominator();
            resultNum = getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator();
        }

        return createNormalised(resultNum, resultDom);

    }

    @Override
    public IFraction minus(IFraction other) {

        int resultNum;
        int resultDom;

        if (getDenominator().equals(other.getDenominator())) {
            resultNum = getNumerator() - other.getNumerator();
            resultDom = getDenominator();
        }
        else {
            resultDom = getDenominator() * other.getDenominator();
            resultNum = getNumerator() * other.getDenominator() - other.getNumerator() * getDenominator();
        }

        return createNormalised(resultNum, resultDom);
    }

    @Override
    public IFraction times(IFraction other) {

        int resultNum = getNumerator() * other.getNumerator();
        int resultDom = getDenominator() * other.getDenominator();

        return createNormalised(resultNum, resultDom);
    }

    @Override
    public IFraction dividedBy(IFraction other) {

        int resultNum = getNumerator() * other.getDenominator();
        int resultDom = getDenominator() * other.getNumerator();

        return createNormalised(resultNum, resultDom);
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        if (numerator == denominator) {
            numerator = 1;
            denominator = 1;
        } else {
            int gcd = 1;
            for (int i = 1; i <= numerator && i <= denominator; i++) {
                if (numerator % i == 0 && denominator % i == 0) {
                    gcd = i;
                }
            }
            numerator = numerator / gcd;
            denominator = denominator / gcd;

        }
        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}

