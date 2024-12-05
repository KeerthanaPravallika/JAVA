package FunctionalInterface;

/*
It operates on two objects and returns a predicate value based on that condition.

- isEqual() - Returns a predicate that tests if two arguments are equal
- and() - Used for predicate chaining
- negate() - Negation means that the result of the Predicate<T> will be inverted (i.e. true becomes false and false becomes true ).
- or() - Logical OR returns true if one or the other predicate is true
- test() -  Used to pass the argument
 */
import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> compareTwoNumbers = (num1,num2)->{
            return num1 == num2;
        };

        System.out.println("Check whether two numbers are equal or not : "+ compareTwoNumbers.test(5,5));
    }
}
