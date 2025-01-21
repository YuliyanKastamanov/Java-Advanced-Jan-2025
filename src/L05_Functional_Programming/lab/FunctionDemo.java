package L05_Functional_Programming.lab;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Императивен подход
        //        System.out.println(powerOf2(5));

        //Декларативен подход
        // f(x) = x * x
        // (x) -> x * x
        // Function<InputParam, ReturnType> -> use with apply
        Function<Integer, Integer> powerOf2Func = x -> x * x;
        //        System.out.println(powerOf2Func.apply(8));

        numbers.stream()
               .map(powerOf2Func)
               .map(x -> x * x)
               .forEach(n -> System.out.print(n + " "));

        // BiFunction<InputParam1, InputParam2, ReturnType>
        // use with apply()
        BiFunction<Integer, Integer, Integer> multiplyFunc = (a, b) -> a * b;

        System.out.println();
        System.out.println(multiplyFunc.apply(5, 6));

        //Our Custom TriFunction<InputParam1, InputParam2, InputParam3, ReturnType>
        // use with apply()
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a * b * c;
        System.out.println(triFunction.apply((int) 2.5555, 3, 2));
    }

    //Метод който вдига число на 2-ра степен
    private static int powerOf2(int a) {
        return a * a;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int multiply3Numbers(int a, int b, int c) {
        return a * b * c;
    }

}
