package FunctionalInterface;

/*
A function is a type of functional interface in Java that receives only a single argument and returns a value after the required processing.

Function<T,R> - A `Function` is a functional interface that represents an operation that takes an input of type `T` and produces an output of type `R`.

The Function interface consists of the following 4 methods as listed which are later discussed as follows:

apply() - This method takes in only one parameter t which is the function argument
andThen() - function wherein the parameterized function will be executed after the first one.
compose() - function mentioned in compose will execute first and then the other function . Opposite of andThen() in order of execution
identity() - This method returns a function that returns its own argument

 */
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // Integer is datatype of input parameter
        // String is the datatype of return value
        Function<Integer, String> returnAge = (age)->{
            return "Age is "+age;
        };

        System.out.println(returnAge.apply(20));

        /*
        First returnHalf function will be executed and the output will be Double datatype value
        the next function to be executed should have input parameter as Double datatype because , the output of the first function
        will be passed as the input parameter for the second function
        */
        Function<Integer, Double> returnHalf = (num -> num/2.0);

        Function<Double,Double> returnThriceValue = (num -> num*3);

        System.out.println(returnHalf.andThen(returnThriceValue).apply(20));




        /*
        Demo of compose() and andThen()
         */

        Function<Integer,Integer> multiplyBy2 = (num)->{
            System.out.println("multiplyBy2 method is executing ..... ");
            return num*2;
        };

        Function<Integer,Integer> divideBy5 = (num)->{
            System.out.println("multiplyBy5 method is executing ..... ");
            return num/5;
        };

        // andThen() - First multiplyBy2 will be executed followed by divideBy5
        System.out.println(multiplyBy2.andThen(divideBy5).apply(12));

        // andThen() - First divideBy5 will be executed followed by multiplyBy2
        System.out.println(multiplyBy2.compose(divideBy5).apply(12));

        Function<Integer, Integer> i = Function.identity();

        System.out.println("Identity method : "+ i.apply(10));



    }
}
