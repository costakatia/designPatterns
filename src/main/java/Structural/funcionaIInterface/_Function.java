package Structural.funcionaIInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = incrementByOne(1);
        System.out.println(increment);
        int increment2 =incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Function<Integer, Integer> addby1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addby1AndThenMultiplyBy10.apply(4));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number *10;
    static int incrementByOne(int number){
        return number +1;
    }
}
