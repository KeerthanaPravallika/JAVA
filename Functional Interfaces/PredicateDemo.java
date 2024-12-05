package FunctionalInterface;

/*

A function that accepts an argument and, in return, generates a boolean value as an answer is known as a predicate

Methods of predicate

- isEqual() -Returns a predicate that tests if two arguments are equal
- and() - Used for predicate chaining
- negate() - Negation means that the result of the Predicate<T> will be inverted (i.e. true becomes false and false becomes true ).
- or() - Logical OR returns true if one or the other predicate is true
- test() -  Used to pass the argument

 */
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> checkIsPositive = (num) -> {
            if(num>0) return true;
            else return false;
        };

        // test is used to pass the argument

        System.out.println("Check whether argument passed is positive or not : " + checkIsPositive.test(10));

        // negation of result
        System.out.println("Negation of the above result using negate() : "+checkIsPositive.negate().test(10));

        Predicate<Integer> isGreaterThan5 = (num) -> {
            if(num>5) return true;
            else return false;
        };

        Predicate<Integer> isLessThanNegative5 = (num) -> {
            if(num<-5) return true;
            else return false;
        };

        // Predicate chaining
        // First it will check whether it is positive and then greater than 5 with the argument passed
        System.out.println("Checking whether the given number is positive AND greater than 5  : " + checkIsPositive.and(isGreaterThan5).test(20));

        // OR
        System.out.println("Checking whether the given number is positive OR greater than 5  : " + checkIsPositive.or(isLessThanNegative5).test(-10));
    }
}
