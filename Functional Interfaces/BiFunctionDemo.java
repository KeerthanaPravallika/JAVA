package FunctionalInterface;

/*

BiFunction<T,U,R> - T,U are datatype of input parameters and R is return datatype
 */
import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {

        BiFunction<String,Integer,String> returnStatement =(name,age) -> {
            return name + "'s age is " + age;
        };

        System.out.println(returnStatement.apply("Praneetha",20));
    }
}
