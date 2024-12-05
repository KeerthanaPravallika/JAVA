package FunctionalInterface;

/*

Functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.

A functional interface can have any number of default methods.

Functional Interface is also known as SAM (Single Abstract Method Interface

Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface)

It is not mandatory to use the annotation
 */
@FunctionalInterface
interface Calculation{
    int calculate(int x,int y);
}


// If we are using lambda expression no need to implement the interface because it implicitly implements the interface
public class CustomFunctionalInterface {
    public static void main(String[] args) {

        // USING LAMBDA Expression
        Calculation calculation = (x,y)->{
            return x+y;
        };
        System.out.println("Using lambda expression : " + calculation.calculate(2,10));
        // USING NON LAMBDA Expression
        Calculation calculation1 = new Calculation() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        System.out.println("Using anonoymous class : " + calculation1.calculate(20,25));

    }
}
