import java.lang.reflect.Method;
import java.util.Arrays;

public class Tracker {

    @Author(name = "Peter")
    public static void printMethodsByAuthor(Class<?> cl) throws NoSuchMethodException {

        Method[] declaredMethods = cl.getDeclaredMethods();

        Arrays.stream(declaredMethods)
        .filter(method -> method.isAnnotationPresent(Author.class))
        .forEach(method -> {
            Author authorAnnotation = method.getAnnotation(Author.class);
            System.out.printf("%s: %s\n", authorAnnotation.name(),
                              method.getName());
        });


    }
}
