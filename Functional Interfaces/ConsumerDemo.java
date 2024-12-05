package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*

- The consumer interface of the functional interface is the one that accepts only one argument
- The consumer interface has no return value.

- Two functions of Functional Interface are
    - accept() - accepts one value and performs the operation on the given argument
    - andThen() - It returns a composed Consumer wherein the parameterized Consumer will be executed after the first one.
 */
public class ConsumerDemo {
    public static void main(String[] args) {

        // demo of accept()
        Consumer<Integer> printValues = (Integer num) -> {
            System.out.println("Value printed using consumer : " + num);
        };

        printValues.accept(20);

        // demo of andThen()

        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);

        Consumer<List<Integer>> printArrayList = (list) -> {
            System.out.println("andThen printArrayList function executing : ");
            list.forEach(num -> System.out.println( num));
        };

        Consumer<List<Integer>> modifyArrayList = new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                System.out.println("accept function executing .... ");
                for (int i=0;i<numList.size();i++){
                    numList.set(i, numList.get(i)*2);
                }
            }
        };

        /*

        It will accept numList as input parameter
        modifyArrayList will be executed first , which will double the value
        and then printArrayList will be excuted printing the values
         */

        modifyArrayList.andThen(printArrayList).accept(numList);


    }
}
