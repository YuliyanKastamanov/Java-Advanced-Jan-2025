import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        Class<Reflection> reflectionClass = Reflection.class;

        Method[] declaredMethods = reflectionClass.getDeclaredMethods();
        Field[] declaredFields = reflectionClass.getDeclaredFields();

        Arrays.stream(declaredFields)
              .filter(field -> !Modifier.isPrivate(field.getModifiers()))
              .forEach(field -> System.out.printf("%s must be private!\n",
                                                  field.getName()));

        System.out.println();

        Arrays.stream(declaredMethods)
              .filter(method -> method.getName().startsWith("get"))
              .filter(method -> !Modifier.isPublic(method.getModifiers()))
              .forEach(method -> System.out.printf("%s have to be public!\n",
                                                   method.getName()));

        System.out.println();

        Arrays.stream(declaredMethods)
              .filter(method -> method.getName().startsWith("set"))
              .filter(method -> !Modifier.isPrivate(method.getModifiers()))
              .forEach(method -> System.out.printf("%s have to be private!\n",
                                                   method.getName()));

    }
}
