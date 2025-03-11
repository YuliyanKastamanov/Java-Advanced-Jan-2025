import java.lang.reflect.Method;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        Class<Reflection> reflectionClass = Reflection.class;

        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        Arrays.stream(declaredMethods)
              .filter(method -> method.getName().startsWith("get"))
              .forEach(method -> System.out.printf("%s will return class %s\n",
                                                   method.getName(),
                                                   method.getReturnType().getSimpleName()));

        Arrays.stream(declaredMethods)
              .filter(method -> method.getName().startsWith("set"))
              .forEach(method -> System.out.printf("%s and will set field of class %s\n",
                                                   method.getName(),
                                                   method.getReturnType().getSimpleName()));

    }
}
