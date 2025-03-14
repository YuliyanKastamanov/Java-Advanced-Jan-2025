package OOP.L07_Reflection_and_Annotations.Exercise.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();
        Method[] methods = blackBoxInt.getClass().getDeclaredMethods();

        Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        while (!input.equals("END")){

            //add_999999
            String command = input.split("_")[0];
            int value = Integer.parseInt(input.split("_")[1]);

            Method currentMethod = Arrays.stream(methods)
                    .filter(method -> method.getName().equals(command))
                    .findFirst()
                    .orElse(null);

            currentMethod.setAccessible(true);
            currentMethod.invoke(blackBoxInt, value);

            System.out.println(innerValue.get(blackBoxInt));

            input = scanner.nextLine();
        }




    }
}
