package FunctionalInterface;

import java.util.function.BiConsumer;

/*
BiConsumer Interface represents a function that takes in two arguments and produces a result.
However, these kinds of functions doesn’t return any value.

- accept() - accepts one value and performs the operation on the given argument
- andThen() - It returns a composed Consumer wherein the parameterized Consumer will be executed after the first one.
 */
public class BiConsumerDemo {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> isEqual = (num1, num2) -> {
            System.out.println("num1 and num2 are equal or not - " + (num1 == num2));
        };

        isEqual.accept(5,10);

    }
}
