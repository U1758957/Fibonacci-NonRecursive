package fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zac King
 * @date 10/03/2019
 */
public class Fibonacci {

    private List<BigInteger> previousCalculations = new ArrayList<>();
    private int length;
    private long amount;

    /**
     * A constructor for Fibonacci.java
     *
     * @param amount the amount of fibonacci sequence you wish to calculate
     */
    public Fibonacci(long amount) {
        this.amount = amount;
        this.length = 0;
    }

    /**
     * Adds a calculated fibonacci to the list
     *
     * @param n the calculated fibonacci
     */
    private void addCalculation(BigInteger n) {
        this.previousCalculations.add(n);
    }

    /**
     * Performs the fibonacci sequence
     *
     * @param n the nth fibonacci to calculate
     * @return the calculated fibonacci
     */
    private BigInteger fibSeq(BigInteger n) {
        if (!(n.compareTo(BigInteger.valueOf(2)) < 0)) {
            length = this.previousCalculations.size();
            return this.previousCalculations.get(length - 1).add(this.previousCalculations.get(length - 2));
        } else return n;
    }

    /**
     * The main method runs this; loops until the amount and adds each result to the list
     */
    public void runFib() {

        for (BigInteger x = BigInteger.ZERO; x.compareTo(BigInteger.valueOf(amount)) < 0; x = x.add(BigInteger.ONE)) {
            addCalculation(fibSeq(x));
        }

    }

    /**
     * Custom toString method for neatly outputting the fibonacci sequence
     *
     * @return the fibonacci sequence as a nice string
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        String separator = System.lineSeparator();
        for (int x = 0; x < previousCalculations.size(); x++) {
            string.append(x + 1).append(": ").append(previousCalculations.get(x)).append(separator);
        }
        return string.toString();
    }
}
