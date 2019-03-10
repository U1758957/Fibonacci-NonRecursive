import fibonacci.Fibonacci;

/**
 * @author Zac King
 * @date 10/03/2019
 * <p>
 * The main class. If you plan on calculating a large number of fibonacci's, you will need to set the RAM allocation
 * to be quite high. Calculating 500,000 fibonacci's needs more than 8GB of RAM! The reason for this is because of
 * the printing. If you printed it out as each fibonacci was calculated (or used threads and a separate class with locks
 * and conditions for the same result but Fibonacci.java could spend more time calculating than printing), then you
 * would only need to store the previous two fibonacci calculations and nothing else, so you would save a lot of RAM
 * that way. Challenge maybe? :)
 */
public class Main {

    /**
     * Main method
     *
     * @param args unused
     */
    public static void main(String[] args) {

        System.out.println("Initializing...");
        Fibonacci fibonacci = new Fibonacci(100);
        System.out.println("Running...");
        fibonacci.runFib();
        System.out.println("Printing...");
        System.out.println(fibonacci.toString());

    }

}
