package FunctionalInterface;

/*

It represents a function which does not take in any argument but produces a value of type T.

 */
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());
    }
}
